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
                slot: '用户管理',
                class: 'el-icon-user',
                bList:[
                    {index: '2-3',navItem: '用户列表', route: '/customer/search'},                
                ]
            },
            {

                index: '3',
                slot: '商品管理',
                class: 'el-icon-goods',
                bList:[
                    {index: '2-4',navItem: '订单列表', route: '/administrator/index'},             
                ]
            },
            {
                index: '4',
                slot: '订单管理',
                class: 'el-icon-s-order',
                bList:[
                    {index: '4-5',navItem: '订单列表', route: '/administrator/index'},               
                ]
            },
            {
                index: '5',
                slot: '退款管理',
                class: 'el-icon-s-release',
                bList:[
                    {index: '5-6',navItem: '退款列表', route: '/administrator/index'},                
                ]
            }
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