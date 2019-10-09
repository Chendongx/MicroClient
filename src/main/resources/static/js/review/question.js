var $ = "";
//初始化
layui.use(['jquery'],function () {
    $ = layui.jquery;
        init(true,"");
    //下拉框
    $.ajax({
        type: "GET",
        url: "/question/getType",
        async: false,
        success: function (res) {
            $.each(res, function(i, item){
                var htmlText = '<option value="'+item.questionType+'">'+item.questionType+'</option>';
                $("select[name='questionType']").append(htmlText);
            });
        }
    });
});
//风琴内容
function init(isAll,keyWord) {
    $.ajax({
        type: "GET",
        url: "/question/init?isAll="+isAll+"&keyWord="+keyWord,
        async: false,
        success: function (res) {
            $("#sfx").empty();
            $.each(res, function(i, item){
                var htmlText = '<div class="layui-colla-item" >' +
                    '   <h2 class="layui-colla-title" id='+item.id+'>'+item.question+'</h2>' +
                    '   <div class="layui-colla-content">' +
                    '       <p>'+item.answer+'</p>' +
                    '   </div>' +
                    '</div>';
                $("#sfx").append(htmlText);
            });
        }
    });
}
//全局
var method = "get";//请求方法类型
var questionId = "";//请求问题ID
//加载模块
layui.use(['layer', 'element', 'form'], function () {
    var layer = layui.layer
        , element = layui.element
        , form = layui.form;
    //监听折叠
    element.on('collapse(questionContext)', function (data) {
        var d = data;
        questionId = data.title.context.id;
        layer.msg(questionId);
    });
    //图标点击事件
    $('#operation .layui-btn').on('click', function () {
        var othis = $(this);
        method = othis.data('method');
        if(method == 'index') {
            window.location.href = "/index";
        }else if (method == 'search'){
            var temp = form.val("search").isAll=="ON" ? true : false;
            init( temp ,form.val("search").questionType );
            element.render();
        }else if( method == "post" || ( method != 'post' && questionId != "" )){
            notice ? notice.call(this, othis) : '';
        }else{
            layer.msg("请选择你要操作的题目!");
        }
    });
    //弹窗触发事件-表单
    notice = function () {
        layer.open({
            type: 1
            , title: "问题信息修改" //不显示标题栏
            , area: ['1100px', '700px']
            , shade: 0.8
            , id: 'LAY_layuipro' //设定一个id，防止重复弹出
            , btn: ['提交', '重置', '取消']
            , btnAlign: 'c'
            , anim: 5
            , moveType: 1 //拖拽模式，0或者1
            , content: $('#questionFrom')
            , success: function (layero) {
                form.val('questionData', {
                    "id": ""
                    ,"question": ""
                    ,"questionType": ""
                    ,"answer": ""
                });
                if (method != 'post'){
                    $.ajax({
                        type: "GET",
                        url: "/question/"+questionId,
                        async: false,
                        success: function (res) {
                            if (res != null){
                                form.val('questionData', {
                                    "id": res.id
                                    ,"question": res.question
                                    ,"questionType": res.questionType
                                    ,"answer": res.answer
                                });
                            }
                        }
                    });
                }
                fRender();
            }, btn1: function (index, layero) {
                $("#sub").click();
            }, btn2: function (index, layero) {
                $("#res").click();
                return false;
            }, btn3: function (index, layero) {
                $("#questionFrom").hide();
            }
        });
    }
    //表单提交
    form.on('submit(questionSubmit)', function (data) {
        var TypeVal = $("#inputSelect").find('input').val();
        if( TypeVal != null ){
            data.field.questionType = TypeVal;
        }
        $.ajax({
            type: method,
            url: "/question/",
            data: JSON.stringify(data.field),
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            //async: false,
            success: function (res) {
                layer.msg("success");
                if(res){
                    layer.msg('大部分参数都是可以公用的<br>合理搭配，展示不一样的风格', {
                        time: 20000, //20s后自动关闭
                        btn: ['yes', 'no']
                    });
                }
            }
        });
    });
});

//表单渲染
fRender = function(){
    $("#questionFrom").show();
    $(".layui-form-select dl dd").css("color","black");
    $("#inputSelect").find('input').removeAttr("readonly");
}
/*
$.ajax({
    type: "GET",
    url: "/question/init",
    success: function (res) {
        layer.msg(res);
    }
});

//Ajax获取
$.post('url', {}, function(str){
  layer.open({
    type: 1,
    content: str //注意，如果str是object，那么需要字符拼接。
  });
});
*/