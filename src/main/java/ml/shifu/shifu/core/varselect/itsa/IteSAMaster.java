/*
 * Copyright [2013-2015] PayPal Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.core.varselect.itsa;

import ml.shifu.guagua.master.AbstractMasterComputable;
import ml.shifu.guagua.master.MasterContext;
import ml.shifu.shifu.core.dtrain.nn.NNMaster;

/**
 * Created by zhanhu on 11/7/16.
 */
public class IteSAMaster extends AbstractMasterComputable<MasterIteSAParams, WorkerIteSAParams> {

    @SuppressWarnings("unused")
    private NNMaster master;

    @Override
    public void init(MasterContext<MasterIteSAParams, WorkerIteSAParams> context) {
        //        master = new NNMaster();
        //      master.init(null);
    }



    @Override
    public MasterIteSAParams doCompute(MasterContext<MasterIteSAParams, WorkerIteSAParams> context) {
        return null;
    }

}
