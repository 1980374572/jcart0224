const routes = [
  { path: '/administrator/index', component: AdministratorIndexRoutePage },
  { path: '/administrator/create', component: administratorCreateRoutePage },
  { path: '/administrator/update/:administratorId', component: administratorUpdateRoutePage },
  { path: '/administrator/updateprofile', component: AdministratorUpdateProfileRoutePage },

  { path: '/customer/search', component: CustomerSearchRoutePage },
  { path: '/customer/show/:customerId', component: CustomerShowRoutePage },
  { path: '/address/index/:customerId', component: AddressIndexRoutePage },
  { path: '/address/show/:addressId', component: AddressShowRoutePage },
];

const router = new VueRouter({
  routes: routes
});