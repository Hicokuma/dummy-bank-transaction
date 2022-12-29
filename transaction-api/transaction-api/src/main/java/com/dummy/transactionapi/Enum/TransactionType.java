package com.dummy.transactionapi.Enum;

public enum TransactionType {

    DEBIT (1){
        @Override
        public boolean isDebit() {
            return true;
        }
    },
    CREDIT(-1) {
        @Override
        public boolean isCredit() {
            return true;
        }
    };

    private final int sign;

    public int getSign () {
        return sign;
    }

    TransactionType(int sign) {
        this.sign = sign;
    }

    public boolean isDebit() {
        return false;
    }

    public boolean isCredit() {
        return false;
    }
}
