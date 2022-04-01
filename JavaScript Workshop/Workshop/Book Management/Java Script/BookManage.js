class Book{
    constructor(id,name,author,publication)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publication=publication;
    }
}
var bookarr=[{"id":"p101","name":"SHriman Yogi","author":"Ranjit Desai","publication":"Mehta Publication House"}];
//  localStorage.setItem("book",JSON.stringify(bookarr));
const addBookHandler=()=>
{
    var bname=document.getElementById("bnm").value;
    console.log(bname);
    var bid=document.getElementById("name").value;
    console.log(bid);
    var bauth=document.getElementById("auth").value;
    var bpub=document.getElementById("pub").value;
     var newBook=new Book(bid,bname,bauth,bpub);
     bookarr.push(newBook);
     console.log(bookarr);
    window.alert(" Added Successfully ");
    window.alert(" Enter new Details ");
    localStorage.setItem("book",JSON.stringify(bookarr));
    console.log(bookarr);
}

const editBookHandler=()=>{
    var bname=document.getElementById("bnm").value;
    console.log(bname);
    var bid=document.getElementById("name").value;
    console.log(bid);
    var bauth=document.getElementById("auth").value;
    var bpub=document.getElementById("pub").value;
    console.log("before")
    console.log(bookarr);
    var temp=JSON.parse(localStorage.getItem("book"));
    var obj= temp.findIndex((obj=>obj.id==bid));
    if(bname!==null)
    {
        bookarr[obj].name=bname;
    }
    if(bauth!==null)
    {
        bookarr[obj].author=bauth;
    }
    if(bpub!==null)
    {
        bookarr[obj].publication=bpub;
    }
    console.log("after");
    console.log(bookarr);
}
function displayBookHandler()
{
    var table=document.getElementById('idtab')  ; 
    var temp=JSON.parse(localStorage.getItem("book"));
    console.log("temp",temp);
    temp.map((item,index)=>{
        console.log(item.id);
        let row=document.createElement('tr');
        let cell=document.createElement('td');
        cell.innerHTML=item.id;
        row.appendChild(cell);
        table.appendChild(row);
    });
    var table=document.getElementById('nametab')  ; 
    var temp=JSON.parse(localStorage.getItem("book"));
    console.log("temp",temp);
    temp.map((item,index)=>{
        console.log(item.id);
        let row=document.createElement('tr');
        let cell=document.createElement('td');
        cell.innerHTML=item.name;
        row.appendChild(cell);
        table.appendChild(row);
    });
    var table=document.getElementById('authtab')  ; 
    var temp=JSON.parse(localStorage.getItem("book"));
    console.log("temp",temp);
    temp.map((item,index)=>{
        console.log(item.id);
        let row=document.createElement('tr');
        let cell=document.createElement('td');
        cell.innerHTML=item.author;
        row.appendChild(cell);
        table.appendChild(row);
    });
    var table=document.getElementById('pubtab')  ; 
    var temp=JSON.parse(localStorage.getItem("book"));
    console.log("temp",temp);
    temp.map((item,index)=>{
        console.log(item.id);
        let row=document.createElement('tr');
        let cell=document.createElement('td');
        cell.innerHTML=item.publication;
        row.appendChild(cell);
        table.appendChild(row);
    });
    localStorage.setItem("book",JSON.stringify(bookarr));
}
