var app = new Vue({
    el: '#app',
    data: {
        isCollapse: true,
        aList: [
            {
                index: '1-1',
                slot: '管理员管理',
                class: 'el-icon-s-custom',
                bList:[
                    {name: '/administrator-index.html',navItem: '管理员列表'},
                    {name: '/administrator-update-profile.html',navItem: '修改个人信息'},
                ]
            },
            {
                index: '2-1',
                slot: '用户管理',
                class: 'el-icon-user',
                bList:[
                    {name: '/customer-search.html',navItem: '用户列表'},                
                ]
            },
            {

                index: '3-1',
                slot: '商品管理',
                class: 'el-icon-goods',
                bList:[
                    {name: '/product-search.html',navItem: '订单列表'},             
                ]
            },
            {
                index: '4-1',
                slot: '订单管理',
                class: 'el-icon-s-order',
                bList:[
                    {name: '/order-search.html',navItem: '订单列表'},               
                ]
            },
            {
                index: '5-1',
                slot: '退款管理',
                class: 'el-icon-s-release',
                bList:[
                    {name: '/return-search.html',navItem: '退款列表'},                
            ]
            }
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