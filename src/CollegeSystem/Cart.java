package CollegeSystem;
public class Cart {
        private int customerId;
        private int nProducts;
        private Product[] products;
        
        public Cart() { 
        
        }
        

        public Cart(int customerId, int nProducts) {
            this.customerId = Math.abs(customerId);
            this.nProducts = Math.abs(nProducts);
            this.products = new Product[nProducts];
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = Math.abs(customerId);
        }

        public int getnProducts() {
            return nProducts;
        }

        public void setnProducts(int nProducts) {
            this.nProducts = Math.abs(nProducts);
        }

        public Product[] getProducts() {
            return products;
        }

        public void addProduct(Product product) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = product;
                    break;
                }
            }
        }

        public void removeProduct(Product product) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == product) {
                    products[i] = null;
                    break;
                }
            }
        }

        public double calculatePrice() {
            double totalPrice = 0.0;

            for (Product product : products) {
                if (product != null) {
                    totalPrice += product.getPrice();
                }
            }

            return totalPrice;
        }

        public void placeOrder() {
            int length = products.length;
            Product[] orderplace = new Product[length];
            int count = 0;
            for (Product product : products) {
                if (product!= null){
                    orderplace[count++]=product;
                }
                return;

            }
        }
}
