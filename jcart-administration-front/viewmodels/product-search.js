var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1,
        productCode: '',
        productName: '',
        price: '',
        stockQuantity: '',
        selectedStatus: '',
        statuses: [
            { value: 0, label: '下架' },
            { value: 1, label: '上架' },
            { value: 2, label: '待审核' }
        ]
    },
    mounted() {
        this.searchProduct();
    },
    methods: {
        searchProduct(){
            axios.get('/product/search', {
                params: {
                    productCode: this.productCode,
                    productName: this.productName,
                    price: this.price,
                    stockQuantity: this.stockQuantity,
                    status: this.selectedStatus,
                    pageNum: this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        handlePageChange(val){
            console.log('page change');
            this.pageNum = val;
            this.searchProduct();
        },
        handleGoCreateClick(){
            location.href='product-create.html';
        },
        handleGoUpdateClick(index,row){
            console.log('to submit click', row);
            location.href='product-update.html?productId='+row.productId;
        },
        handleSearchClick(){
            this.pageNum = 1;
            this.searchProduct();
        },
        handleClearClick(){
            this.productCode = '';
            this.productName = '';
            this.price = '';
            this.stockQuantity = '';
            this.selectedStatus = '';
            this.pageNum = 1;
            this.searchProduct();
        }
    }   
})