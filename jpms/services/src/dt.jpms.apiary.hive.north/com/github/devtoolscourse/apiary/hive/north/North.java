package com.github.devtoolscourse.apiary.hive.north;

import module dt.jpms.apiary.core;

@Endpoint("/north")
public class North extends Handler<InDTO, OutDTO> {
    public North() {
        super(InDTO.class);
    }

    @Override
    public void handleRequest() {
        var name = this.requestDTO.mesi();
        this.responseDTO = new OutDTO("Tere, " + name + "!");
        this.statusCode = 200;
        System.out.println(requestDTO);
        System.out.println(responseDTO);
    }
}
