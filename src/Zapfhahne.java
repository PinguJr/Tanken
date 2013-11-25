public class Zapfhahn {
        
        private String mTreibstoffnamen;
        private int mTanksaeule;
        private int mZapfhahn;
        
        public Zapfhahn(String pTreibstoffnamen,int pTanksaeule, int pZapfhahn){
                setmZapfhahn(pTanksaeule);
                setmTanksaeule(pTanksaeule);
                setmTreibstoffnamen(pTreibstoffnamen);
        }

        public void setmZapfhahn(int mZapfhahn) {
                this.mZapfhahn = mZapfhahn;
        }

        public int getmZapfhahn() {
                return mZapfhahn;
        }

        public void setmTanksaeule(int mTanksaeule) {
                this.mTanksaeule = mTanksaeule;
        }

        public int getmTanksaeule() {
                return mTanksaeule;
        }

        public void setmTreibstoffnamen(String mTreibstoffnamen) {
                this.mTreibstoffnamen = mTreibstoffnamen;
        }

        public String getmTreibstoffnamen() {
                return mTreibstoffnamen;
        }
}