package com.xingkaichun.helloworldblockchain.node.dto.adminconsole.request;

import com.xingkaichun.helloworldblockchain.netcore.dto.blockchainbranch.BlockchainBranchBlockDto;

import java.util.List;

/**
 *
 * @author 邢开春 xingkaichun@qq.com
 */
public class UpdateBlockchainBranchRequest {

    private List<BlockchainBranchBlockDto> blockList;




    //region get set
    public List<BlockchainBranchBlockDto> getBlockList() {
        return blockList;
    }

    public void setBlockList(List<BlockchainBranchBlockDto> blockList) {
        this.blockList = blockList;
    }
    //endregion
}
