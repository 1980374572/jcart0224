var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1
    },
    mounted() {
        console.log('view mounted');
        this.searchReturn();
    },
    methods: {
        handlePageChange(val) {
            console.log('page changed', val);
            this.pageNum = val;
            this.searchReturn();
        },
        searchReturn() {
            axios.get('/return/search', {
                params: {
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
        handleByreturnId(index,row){
            location.href = "return-show.html?returnId="+row.returnId;
        },
        handleReturn(index,row){
            location.href = "returnhistory-index.html?returnId="+row.returnId;
        },
    }
})