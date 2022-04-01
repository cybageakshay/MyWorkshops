function dispVal(val)
{
    document.getElementById("string").value+=val;
}
function cal()
{
    var x= document.getElementById("string").value;
    var y=eval(x);
    document.getElementById("string").value=y;
}
function clr()
{
    document.getElementById("string").value=" ";
}
function squareRoot()
{
    var x= document.getElementById("string").value;
    var y= Math.sqrt(x);
    document.getElementById("string").value=y;
}
function square()
{
    var x= document.getElementById("string").value;
    var y= x*x;
    document.getElementById("string").value=y;
}
function cube()
{
    var x= document.getElementById("string").value;
    var y= x*x*x;
    document.getElementById("string").value=y;
}
function cubeRoot()
{
    var x= document.getElementById("string").value;
    var y= Math.cbrt(x);
    document.getElementById("string").value=y;
}