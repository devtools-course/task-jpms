package com.github.devtoolscourse.bee;

import com.github.devtoolscourse.bee.workers.CarpenterBee;
import com.github.devtoolscourse.bee.workers.MiningBee;
import com.github.devtoolscourse.bee.yard.Bumblebee;
import com.github.devtoolscourse.bee.yard.Honeybee;

public sealed class Bee permits CarpenterBee, MiningBee, Bumblebee, Honeybee {
    public String bzz() {
        return "Bzz";
    }
}
