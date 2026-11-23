package com.github.devtoolscourse.apiary.hive.south;

import module dt.jpms.apiary.core;

@Endpoint("/south")
public class South extends Handler<InDTO, OutDTO> {
    public South() {
        super(InDTO.class);
    }

    @Override
    public void handleRequest() {
        var name = this.requestDTO.bal();
        this.responseDTO = new OutDTO("Merhaba, " + name + "!");
        this.statusCode = 200;
        System.out.println(requestDTO);
        System.out.println(responseDTO);
    }
}
