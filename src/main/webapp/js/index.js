function athenticate(){
    var email = document.getElementById('userName');
    var password = document.getElementById('password');
    var mainContainer = document.getElementById('main-container');
    for( var i = 0; i < loginInfo.length; i++){
        
        if(email.value == loginInfo[i].userName && password.value == loginInfo[i].password){
            mainContainer.style.display = 'none';
        }
        else{
            email.style.backgroundColor = 'red';
            password.style.backgroundColor = 'red';
        }
    }
}