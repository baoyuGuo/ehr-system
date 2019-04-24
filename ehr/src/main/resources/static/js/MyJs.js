<!--
//�ж�������汾
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

//�ı䵱ǰ����ɫ
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

//ɾ��ǰȷ��
function check(objName){
    var   o=document.getElementsByName(objName)
    for(i=0;i<o.length;i++)if(o[i].checked)return;
    alert("����ѡ����ɾ����");
    location.reload();
}

//ˢ�°�ť
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

//���Ӵ���
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

//��֤��ѡ�򣺱�ѡһ��
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
	        alert('��֧�ֶ�ѡ����ѡ��һ����¼��ִ�д˲�����')
	        return false;
	    }
    }
	else
	{
		alert('请至少选择一项');
		return false;
	}
	
}

//ɾ������֤��ѡ�򣺱�ѡһ������
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
		alert('�뵥��[ѡ��]�еĸ�ѡ��ѡ��һ���������¼����ִ��ɾ��������');
		return false;
	}
	
    if (window.confirm("ɾ�����޷��ٻָ���ȷ��Ҫ����ִ����"))
    {
        return true;
    }
    else
    {
        return false;
    }
}

//��������֤��ѡ�򣺱�ѡһ������
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
		alert('�뵥��[ѡ��]�еĸ�ѡ��ѡ��һ���������¼����ִ�д˲�����');
		return false;
	}
	
    if (window.confirm("ȷ��Ҫ����ִ����"))
    {
        return true;
    }
    else
    {
        return false;
    }
}

/*ȫѡ*/
function chkAllw()
{
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		document.forms["form1"].elements[i].checked=true;
	}
}
/*ȫ��*/
function nochkAll()
{
	for(var i=0;i<document.forms["form1"].elements.length;i++)
	{
		document.forms["form1"].elements[i].checked=false;
	}
}
/*��ѡ*/
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

/*ҳ����Ҷ�λ��ʼ*/
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
/*ҳ����Ҷ�λ����*/

/*��ӡ1��hkshow1 + GridView1*/
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