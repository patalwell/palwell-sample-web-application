/**
 This JS File loads the DOM with a DataTables Object via JQuery API
 For Loading JavaScript Sourced Data and JQuery Datatables take a look at:

 1. https://datatables.net/examples/data_sources/js_array.html
 2. https://datatables.net/forums/discussion/35360/cant-get-json-data-to-show-using-js-object-variable-works-with-ajax

 Get our userList object from Thymeleaf Model
 https://www.thymeleaf.org/doc/articles/thymeleaf3migration.html
 https://github.com/jmiguelsamper/thymeleaf3-template-modes-example
 *

 To Do:

 1. Add file upload ability for Table Injection


 */
//
var modalSectionTable = null;

$(function(){

    function init(){
      document.getElementById('fileInput').addEventListener('change', handleFileSelect, false);
    }

    function handleFileSelect(event){
      const reader = new FileReader()
      reader.onload = handleFileLoad;
      reader.readAsText(event.target.files[0])
    }

    function handleFileLoad(event){
      console.log(event);
      document.getElementById('fileContent').textContent = event.target.result;
    }




    modalSectionTable = $("#table1").DataTable({
                "Paginate": true,
                "bLengthChange": false,
                "bFilter": true,
                "bscrollX": true,
                "bscrollY": true,
                "bSort": true,
                "bInfo": false,
                "bAutoWidth": false,
                "colReorder": true,
                "dom": 'Bfrtip',
                "buttons": [
                    'csv',
                    'excel',
                    'pdf',
                        {
                            extend: 'columnToggle',
                            columns: '.firstColumn'
                        },
                                            {
                            extend: 'columnToggle',
                            columns: '.secondColumn'
                        },
                 ],
                "ajax":'',
                "data": userList,
                "dataSrc": '',
                "columns": [
                    { data: "username" },
                    { data: "mailaddress" },
                ],
                "columnDefs": [
                    { targets: 0, width: 60 },
                    { targets: 1, width: 150 },
                    {targets:'_all',className : 'dt-head-center'},
                ]
            });

        });