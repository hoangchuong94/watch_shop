// var product = {};
// product.showProduct = function () {
//     $ajax({
//         url: "/api/product",
//         dataType: JSON,
//         method: "GET",
//         success: function (data){
//             $each(data, function (index, product) {
//                 $('#allProducts>tbody').prepend(`
//
//                 `)
//             })
//             $('#allProducts').DataTable();
//         }
//     })
//
//     product.init = function () {
//         product.showProduct();
//     }
//     $(document).ready(function () {
//         product.init();
//     })
// }