var app = new Vue({
    el: '#app',
    data: {
        username: '',
        password: ''
    },
    mounted() {
      
    },
    methods: {
        handleLoginClick(){
            this.administratorLogin();
        },
        administratorLogin(){
            axios.get("/administrator/login",
            {
                params:{
                    username : this.username,
                    password : this.password
                }
            })
            .then(res => {
                sessionStorage.setItem("jcartToken", res.data.token);
                alert('登录成功');
                location.href="product-search.html";     
            })
            .catch(function (error) {
                console.log(error);
                alert('登录失败');
            });
        }
    }   
})