package com.xingkaichun.blockchain.core.model.transaction;


import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 交易
 */
@Data
public class Transaction implements Serializable {

    //交易ID
    private String transactionUUID;
    //交易签名
    private byte[] signature;

    //交易类型
    private TransactionType transactionType;
    //交易输入
    private ArrayList<TransactionInput> inputs;
    //交易输出
    private ArrayList<TransactionOutput> outputs;
}
