function sendMail(){
    var params = {
        companyName:document.getElementById("companyName").value,
        personInCharge:document.getElementById("personInCharge").value,
        email:document.getElementById("email").value,
        phone:document.getElementById("phone").value,
        date:document.getElementById("date").value
    };
    const serviceId = "service_dv250z5";
    const templateId = "template_47fe2me";
    Email.send(serviceId,templateId,params).then(
        res =>{
            document.getElementById("companyName").value = "";
            document.getElementById("personInCharge").value = "";
            document.getElementById("email").value = "";
            document.getElementById("phone").value = "";
            document.getElementById("date").value = "";
            console.log(res);
            alert("your message sent successfully");}).catch((err)=> console.log(err));
}
