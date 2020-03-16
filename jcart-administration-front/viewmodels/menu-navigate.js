var app = new Vue({
    router: router,
    el: '#app',
    data: {
        isCollapse: true,
        aList: [
            {
                index: '1',
                slot: '管理员管理',
                class: 'el-icon-s-custom',
                bList:[
                    {index: '1-1',navItem: '管理员列表', route: '/administrator/index'},
                ]
            },
            {
                index: '2',
                slot: '商品管理',
                class: 'el-icon-s-goods',
                bList:[
                    {index: '2-1',navItem: '商品列表', route: '/product/search'},               
                ]
            },
            {
                index: '3',
                slot: '用户管理',
                class: 'el-icon-user',
                bList:[
                    {index: '3-1',navItem: '用户列表', route: '/customer/search'},                
                ]
            },
            {

                index: '4',
                slot: '订单管理',
                class: 'el-icon-s-order',
                bList:[
                    {index: '4-1',navItem: '订单列表', route: '/order/search'},  
                    {index: '4-2',navItem: '退货列表', route: '/return/search'}           
                ]
            },
            
        ],
        my: [
            { name: "个人信息", route: "/administrator/updateprofile", divided: false },
            { name: "关于", route: "/about", divided: false },
            { name: "退出", route: "/administrator/logout", divided: true }
        ],
        // aHtml: ''
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
        handleMyItemClick(val) {
            this.$router.replace(val);
        },
        // goHtml(val){
        //     this.aHtml = val;
        // },
    }   
})