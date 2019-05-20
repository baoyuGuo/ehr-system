//获取浏览器的类型
function getBrowserType() { 
    var ua = navigator.userAgent.toLowerCase();
    if (ua.match(/msie ([\d.]+)/)) return 1;
    //if (ua.match(/firefox\/([\d.]+)/)) return 2;
    if (ua.match(/firefox\/([\d.]+)/)) return 3;
    if (ua.match(/chrome\/([\d.]+)/)) return 3;
    if (ua.match(/opera.([\d.]+)/)) return 4;
    if (ua.match(/version\/([\d.]+)/)) return 5;    //safari
    return 0; 
 }

function con_query_adjust(){
	$.ajax({
        type:'post',
        url:'/humanfiles/condition_query_adjust',
        async:true,
        dataType:'json',
        data: $("#form1").serialize(),
        success:function(res){
        	if(res.status!=200){
        		alert("error");
        		return ;
        	}
        	var data = res.data;
        	if(data.length == 0){
        		alert("查询到0条数据");
        		return;
        	}
        	$(".hkRowStyle").remove();
        	for (var i=1;i<=data.length;i++){
        		var time = data[i-1].time;
        		var index = time.indexOf('T');
        		time = time.substring(0,index);
        		
        		var $tr = $("<tr class=\"hkRowStyle\" onclick=\"javascript:changeBg(this)\">"+
    					"<td align=\"center\"> <span id=\"GridView1_ctl\""+ i +"_lblxh\">"+ i +"</span>"+ "</td>"+
    					"<td align=\"center\" style=\"width:30px;\"><input id=\"GridView1_ctl\""+ i +"\"_CheckSelect\"  value=\""+data[i-1].enumber+"\" type=\"checkbox\" name=\"GridView1$ctl\""+i+"\"$CheckSelect\">"+"</td>"+
    					"<td>" + data[i-1].enumber + "</td>" +
    					"<td>" + data[i-1].ename + "</td>" +
    					"<td align=\"center\">" + data[i-1].title + "</td>" +
    					"<td align=\"center\">" + data[i-1].type + "</td>" +
    					"<td align=\"center\">" + time + "</td>" +
    					"<td align=\"center\" style=\"width:80px;white-space:nowrap;\"> " + 
    						"<span id=\"GridView1_ctl"+i+"_Label1\">" + "<a href=\"javascript:void(0)\" onclick=\"showfrom(1);\" class=\"gvlink\">查看</a></span>" + 
    						"<span id=\"GridView1_ctl"+i+"_Label2\"> <a href=\"javascript:void(0)\" onclick=\"updatefrom(1);\" class=\"gvlink\">修改</a></span></td></tr>");
    					var $table = $(".hkgv");
    					$table.append($tr);
        	}
        }
   });
};

function con_query_reward_punish(){
	$.ajax({
        type:'post',
        url:'/humanfiles/con_query_reward_punish',
        async:true,
        dataType:'json',
        data: $("#form1").serialize(),
        success:function(res){
        	if(res.status!=200){
        		alert("error");
        		return ;
        	}
        	var data = res.data;
        	if(data.length == 0){
        		alert("查询到0条数据");
        		return;
        	}
        	$(".hkRowStyle").remove();
        	for (var i=1;i<=data.length;i++){
        		
        		var $tr = $("<tr class=\"hkRowStyle\" onclick=\"javascript:changeBg(this)\">"+
    					"<td align=\"center\"> <span id=\"GridView1_ctl\""+ i +"_lblxh\">"+ i +"</span>"+ "</td>"+
    					"<td align=\"center\" style=\"width:30px;\"><input id=\"GridView1_ctl\""+ i +"\"_CheckSelect\" type=\"checkbox\"  value=\""+data[i-1].enumber+"\"  name=\"GridView1$ctl\""+i+"\"$CheckSelect\">"+"</td>"+
    					"<td>" + data[i-1].enumber + "</td>" +
    					"<td>" + data[i-1].ename + "</td>" +
    					"<td align=\"center\">" + data[i-1].type + "</td>" +
    					"<td align=\"center\">" + data[i-1].title + "</td>" +
    					"<td align=\"center\">" + data[i-1].remarks + "</td>" +
    					"<td align=\"center\" style=\"width:80px;white-space:nowrap;\"> " + 
    						"<span id=\"GridView1_ctl"+i+"_Label1\">" + "<a href=\"javascript:void(0)\" onclick=\"showfrom(1);\" class=\"gvlink\">查看</a></span>" + 
    						"<span id=\"GridView1_ctl"+i+"_Label2\"> <a href=\"javascript:void(0)\" onclick=\"updatefrom(1);\" class=\"gvlink\">修改</a></span></td></tr>");
    					var $table = $(".hkgv");
    					$table.append($tr);
        	}
        }
   });
};

var orObj;
var orBg;
function changeBg(obj){
if(orObj){
orObj.style.backgroundColor=orBg;
}
orObj = obj;
orBg = obj.style.backgroundColor;
obj.style.backgroundColor='#C1DDF1';
}

function check(objName){
    var   o=document.getElementsByName(objName)
    for(i=0;i<o.length;i++)if(o[i].checked)return;
    alert("����ѡ����ɾ����");
    location.reload();
}

function reload()   
{   
  var name=navigator.appName   
  var vers=navigator.appVersion   
  if(name=='Netscape'){   
    window.location.reload(true)   
  }
  else{   
    history.go(0)   
  }   
}

function popAdd(src){
    window.open (src,'newwindow1','height=550,width=750,top='+(screen.height-550)/2+',left='+(screen.width-750)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//�޸Ĵ���
function popMod(src){
    window.open (src,'newwindow2','height=550,width=750,top='+(screen.height-550)/2+',left='+(screen.width-750)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no')
}

//ά��/�鿴����
function popView(src){
    window.open (src,'newwindow3','height=550,width=750,top='+(screen.height-550)/2+',left='+(screen.width-750)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//��ӡ����
function popPrn(src){
    window.open (src,'newwindow4','height=550,width=750,top='+(screen.height-550)/2+',left='+(screen.width-750)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//��������
function popHelp(src){
    window.open (src,'newwindow5','height=500,width=400,top='+(screen.height-500)/2+',left='+(screen.width-400)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//�����
function popWin_w(src){
    window.open (src,'newwindow6','height=500,width=1000,top='+(screen.height-500)/2+',left='+(screen.width-1000)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//�ϴ󴰿�
function popWin_m(src){
    window.open (src,'newwindow7','height=700,width=1000,top='+(screen.height-700)/2+',left='+(screen.width-1000)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no') 
}

//��С����
function popWin_s(src){
    window.open (src,'newwindow8','height=400,width=650,top='+(screen.height-400)/2+',left='+(screen.width-650)/2+',toolbar=no,menubar=no,scrollbars=yes,resizable=yes,location=no,status=no')
}

//���㴰��
function popMini(src){
    window.open(src,'newwindow9','resizable=yes,scrollbars=yes,top='+(screen.height-480)/2+',left='+(screen.width-380)/2+',width=480,height=380')
} 

//Modalģ̬���ڣ���
function popModal_w(src){
var vDialog=null;
vDialog=showModalDialog(src,window,"status:no;scrollbars:yes;resizable:off;dialogHeight:750px;dialogWidth:1000px;unadorne:yes;help:no");
}

//Modalģ̬���ڣ��У�
function popModal_m(src){
var vDialog=null;
vDialog=showModalDialog(src,window,"status:no;scrollbars:yes;resizable:off;dialogHeight:680px;dialogWidth:750px;unadorne:yes;help:no");
}
  
//Modalģ̬���ڣ�С��
function popModal_s(src){
var vDialog=null;
vDialog=showModalDialog(src,window,"status:no;scrollbars:yes;resizable:off;dialogHeight:380px;dialogWidth:550px;unadorne:yes;help:no");
}

//ȫѡ/ȫ��ѡ
function chkAll()
{
var chkall= document.all["chkall"];
var chkother= document.getElementsByTagName("input");
for (var i=0;i<chkother.length;i++)
    {
    if( chkother[i].type=='checkbox')
        {
            if(chkother[i].id.indexOf('GridView1')>-1)
            {
                if(chkall.checked==true)
                {
                    chkother[i].checked=true;
                }
                else
                {
                    chkother[i].checked=false;
                }
            }
        }
    }
}

//ȫѡ��ȡ����ѡ��
function CheckAll(form)
{
    for (var k=0;k<form.elements.length;k++)
    {
        var e = form.elements[k];
        //�жϲ���ѡ����
        if (e.name != 'chkall'){
           //�ж�ѡ���� �߼����� 
           if (e.name != 'gjjs'){
           //�ж�ѡ���� �������� 
             if (e.name != 'gltj'){
                e.checked = form.chkall.checked;
             }
           }
        }
    }
}

function modcheck()
{
    var j=0

    //for(var i=0;i<document.form1.elements.length;i++)
    for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
	    //if(document.form1.elements[i].checked==true)
	    if(document.forms["form1"].elements[i].checked==true)
	    {
	        j=j+1
	    }
	}
	
	if(j>0)
	{
        if(j>1)
	    {
	        alert('只能选择一项！')
	        return false;
	    }
    }
	else
	{
		alert('请至少选择一项');
		return false;
	}
	
}

//删除所选中的内容前的检查
function delcheck()
{
	var j=0
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		if(document.forms["form1"].elements[i].checked==true)
		{
		    j=j+1
		}
	}
	
	if(j>0)
	{

	}
	else
	{
		alert('请至少选中一项');
		return false;
	}
	
    if (window.confirm("删除后无法恢复，确定删除所选内容吗？"))
    {
        return true;
    }
    else
    {
        return false;
    }
}

function audicheck()
{
	var j=0
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		if(document.forms["form1"].elements[i].checked==true)
		{
		    j=j+1
		}
	}
	
	if(j>0)
	{

	}
	else
	{
		alert('请至少选中一项');
		return false;
	}
	
    if (window.confirm("删除后无法恢复，确定要删除所选中内容吗？"))
    {
        return true;
    }
    else
    {
        return false;
    }
}

//全选
function chkAllw()
{
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		document.forms["form1"].elements[i].checked=true;
	}
}

function nochkAll()
{
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		document.forms["form1"].elements[i].checked=false;
	}
}

//反选
function revchkAll()
{
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		if(document.forms["form1"].elements[i].checked==true)
		    document.forms["form1"].elements[i].checked=false;
		else
			document.forms["form1"].elements[i].checked=true;
	}
}

var NS4 = (document.layers);    // Which browser?
var IE4 = (document.all);
var win = window;    // window to search.
var n   = 0;
function findInPage(str) {

  var txt, i, found;

  if (str == "")
    return false;

  // Find next occurance of the given string on the page, wrap around to the
  // start of the page if necessary.

  if (NS4) {

    // Look for match starting at the current point. If not found, rewind
    // back to the first match.

    if (!win.find(str))
      while(win.find(str, false, true))
        n++;
    else
      n++;

    // If not found in either direction, give message.

    if (n == 0)
      alert("Not found.");
  }

  if (IE4) {
    txt = win.document.body.createTextRange();

    // Find the nth match from the top of the page.

    for (i = 0; i <= n && (found = txt.findText(str)) != false; i++) {
      txt.moveStart("character", 1);
      txt.moveEnd("textedit");
    }

    // If found, mark it and scroll it into view.

    if (found) {
      txt.moveStart("character", -1);
      txt.findText(str);
      txt.select();
      txt.scrollIntoView();
      n++;
    }

    // Otherwise, start over at the top of the page and find first match.

    else {
      if (n > 0) {
        n = 0;
        findInPage(str);
      }

      // Not found anywhere, give message.

      else
        alert("Not found.");
    }
  }

  return false;
}

function PrintPage1()
{
    document.getElementById("hkshow1").style.visibility="hidden";
    document.getElementById("GridView1") .border="1";
    print();
    document.getElementById("hkshow1").style.visibility="visible";
    document.getElementById("GridView1") .border="0";
}

/*��ӡ2��hkshow1 + hkshow2 + GridView1*/
function PrintPage2()
{
    document.getElementById("hkshow1") .style.visibility="hidden";
    document.getElementById("hkshow2") .style.visibility="hidden";
    document.getElementById("GridView1") .border="1";
    print();
    document.getElementById("hkshow1") .style.visibility="visible";
    document.getElementById("hkshow2") .style.visibility="visible";
    document.getElementById("GridView1") .border="0";
}

/*��ӡ3��hkshow1 + hkshow2 + hktable*/
function PrintPage3()
{
    document.getElementById("hkshow1") .style.visibility="hidden";
    document.getElementById("hkshow2") .style.visibility="hidden";
    document.getElementById("hktable") .border="1";
    print();
    document.getElementById("hkshow1") .style.visibility="visible";
    document.getElementById("hkshow2") .style.visibility="visible";
    document.getElementById("hktable") .border="0";
}

/*��ӡ4��hkshow1*/
function PrintPage4()
{
    document.getElementById("hkshow1") .style.visibility="hidden";
    print();
    document.getElementById("hkshow1") .style.visibility="visible";
}

/*��ӡ5��hkshow1 + hkshow2 + hkshow3 + hktable*/
function PrintPage5()
{
    document.getElementById("hkshow1") .style.visibility="hidden";
    document.getElementById("hkshow2") .style.visibility="hidden";
    document.getElementById("hkshow3") .style.visibility="hidden";
    document.getElementById("hktable") .border="1";
    print();
    document.getElementById("hkshow1") .style.visibility="visible";
    document.getElementById("hkshow2") .style.visibility="visible";
    document.getElementById("hkshow3") .style.visibility="visible";
    document.getElementById("hktable") .border="0";
}

/*��ӡ6��hkshow1 + GridView1 + GridView2 + GridView3*/
function PrintPage6()
{
    document.getElementById("hkshow1").style.visibility="hidden";
    document.getElementById("GridView1") .border="1";
    document.getElementById("GridView2") .border="1";
    document.getElementById("GridView3") .border="1";
    print();
    document.getElementById("hkshow1").style.visibility="visible";
    document.getElementById("GridView1") .border="0";
    document.getElementById("GridView2") .border="0";
    document.getElementById("GridView3") .border="0";
}

/*��ӡ7��hkshow1 + GridView1 + GridView2*/
function PrintPage7()
{
    document.getElementById("hkshow1").style.visibility="hidden";
    document.getElementById("GridView1") .border="1";
    document.getElementById("GridView2") .border="1";
    print();
    document.getElementById("hkshow1").style.visibility="visible";
    document.getElementById("GridView1") .border="0";
    document.getElementById("GridView2") .border="0";
}

function killErrors() {
    return true;
}
window.onerror = killErrors;
//-->