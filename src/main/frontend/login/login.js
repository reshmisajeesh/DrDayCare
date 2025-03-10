//Relates to only button
$( "button" ).click(function() {
    login();
})

//Function is used to complete login. First checks are made to make sure that both text fields are filled in.
//Then use DataService to make call to server with request.
//Finally once the response is received, it will either tell the user they have not received
function login(){
    var name = $("#nameInput").val();
    var password = $("#passwordInput").val();

    if (name === "")
        bootstrap_alert.warning("No name entered. Please enter name and try again");
    else if (password === "")
        bootstrap_alert.warning("No password entered. Please enter password and try again");
    else{
        var input = {};
        input.name = name;
        input.password = password;

        var response = checkLogin(input);

        alert(JSON.stringify(response));

        if (response.valid === true){
            var user = response.user;
            switch (user.userRole) {
                case 1: window.location.replace("dummy_pages/dummy1.html"); break;
                case 2: window.location.replace("dummy_pages/dummy2.html"); break;
                case 3: window.location.replace("dummy_pages/dummy3.html"); break;
                case 4: window.location.replace("dummy_pages/dummy4.html"); break;
                case 5: window.location.replace("dummy_pages/dummy5.html"); break;
            }
        }
        else{
            bootstrap_alert.warning("Invalid username or password was given.");
        }
    }

}
//Hiding the box that will be used to display warning
$("#alert-box").hide();

//Function to get rid of alert after displaying it.
bootstrap_alert = function() {}
bootstrap_alert.warning = function(message) {
    document.getElementById("alert-box").innerHTML = message;
    $("#alert-box").fadeTo(2000, 500).slideUp(500, function() {
        $("#alert-box").slideUp(500);
    });
};



