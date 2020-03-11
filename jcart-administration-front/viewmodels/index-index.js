var app = new Vue({
    el: '#app',
    data: {
        isCollapse: true,
        administratorList: [
            {name: '/administrator-index.html',navItem: '管理员列表'},
            {name: '/administrator-update-profile.html',navItem: '修改个人信息'},
        ],
        customerList:[
            {name: '/customer-search.html',navItem: '用户列表'},
        ],
        productList:[
            {name: '/product-search.html',navItem: '订单列表'},
        ],
        orderList:[
            {name: '/order-search.html',navItem: '订单列表'},
        ],
        returnList:[
            {name: '/return-search.html',navItem: '退款列表'},
        ],
        aHtml: ''
    },
    mounted() {
      
    },
    methods: {
        handleOpen(key, keyPath) {
            console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
            console.log(key, keyPath);
        },
        goHtml(val){
            this.aHtml = val;
        },
    }   
})