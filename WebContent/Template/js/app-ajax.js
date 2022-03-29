$(document).ready(function() {
        $('#Kind').blur(function(event) {
                var k = $('#Kind').val();
                $.get('AjaxServlet', {
                	Kind : k
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text(responseText);
                });
        });
});