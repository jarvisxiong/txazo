<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加事项</title>
    <%@ include file="../decorator/head.jsp" %>
    <link href="http://cdn.bootcss.com/bootstrap-datetimepicker/4.14.30/css/bootstrap-datetimepicker.min.css"
          rel="stylesheet">
</head>
<body>
<%@ include file="../decorator/nav-remind.jsp" %>

<div class="container-fluid">
    <ol class="breadcrumb">
        <li class="active">添加事项</li>
    </ol>

    <form action="/remind/add" method="post" class="form-horizontal" style="padding: 0px 15px;" role="form"
          id="add-form">
        <div class="form-group">
            <div class="col-xs-3" style="padding-top: 7px;">
                <label for="type" class="control-label">类&nbsp;&nbsp;型</label>
            </div>
            <div class="col-xs-9">
                <select name="type" class="form-control" id="type">
                    <c:forEach items="${remindTypes}" var="t">
                        <option value="${t.id}">${t.type}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <div class="col-xs-3" style="padding-top: 7px;">
                <label for="cronExpression" class="control-label">Cron表达式</label>
            </div>
            <div class="col-xs-9">
                <input type="text" name="cronExpression" class="form-control" id="cronExpression"
                       placeholder="输入Cron表达式" required/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-xs-3" style="padding-top: 7px;">
                <label for="beginTime" class="control-label">开始时间</label>
            </div>
            <div class="input-group date form_date col-xs-8" id="beginDatePicker" data-date=""
                 data-date-format="yyyy-mm-dd" data-link-field="beginTime" data-link-format="yyyy-mm-dd"
                 style="left: 15px;">
                <input class="form-control" size="10" type="text" value="" readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
            <input type="hidden" id="beginTime" value=""/>
        </div>

        <div class="form-group">
            <div class="col-xs-3" style="padding-top: 7px;">
                <label for="endTime" class="control-label">结束时间</label>
            </div>
            <div class="input-group date form_date col-xs-8" id="endDatePicker" data-date=""
                 data-date-format="yyyy-mm-dd" data-link-field="endTime" data-link-format="yyyy-mm-dd"
                 style="left: 15px;">
                <input class="form-control" size="10" type="text" value="" readonly>
                <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
            <input type="hidden" id="endTime" value=""/>
        </div>

        <div class="form-group">
            <div class="col-xs-3" style="padding-top: 7px;">
                <label for="showType" class="control-label">展示类型</label>
            </div>
            <div class="col-xs-9">
                <select name="showType" class="form-control" id="showType">
                    <c:forEach items="${remindShowTypes}" var="t">
                        <option value="${t.id}">${t.type}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group" id="alertDanger" style="display: none;">
            <div class="alert alert-danger" role="alert" style="padding: 8px; margin-bottom: 0px;"></div>
        </div>

        <div id="contents"></div>

        <div class="form-group">
            <div style="width: 60%; margin: 0 auto;">
                <button type="submit" class="btn btn-danger" style="width:100%;">添加</button>
            </div>
        </div>
    </form>
</div>

<%@ include file="../decorator/foot.jsp" %>
<script src="/js/bootstrap/bootstrap-datetimepicker.min.js"></script>
<script src="/js/bootstrap/bootstrap-datetimepicker.locale.js"></script>
<script src="/js/util/date.js"></script>
<script src="/js/plugin/textarea-multi.js"></script>
<script>
    $(function () {
        $('.form_date').datetimepicker({
            language: 'locale',
            weekStart: 1,
            todayBtn: true,
            autoclose: true,
            todayHighlight: true,
            startView: 2,
            minView: 2,
            forceParse: false
        }).on('changeDate', function (ev) {
            var id = $(this).attr('id');
            if (id == 'beginDatePicker') {
                $('#endDatePicker').datetimepicker('setStartDate', ev.date == null ? null : ev.date.getDateString());
            } else if (id == 'endDatePicker') {
                $('#beginDatePicker').datetimepicker('setEndDate', ev.date == null ? null : ev.date.getDateString());
            }
        });

        $('#contents').multiTextArea({
            name: 'content',
            leftContent: '内容'
        });
    });
</script>
</body>
</html>

