package org.apache.flink.table.ml.lib.tensorflow.param;

import org.apache.flink.ml.api.misc.param.ParamInfo;
import org.apache.flink.ml.api.misc.param.ParamInfoFactory;
import org.apache.flink.ml.api.misc.param.WithParams;

public interface HasTrainOutputCols<T> extends WithParams<T> {
    ParamInfo<String[]> TRAIN_OUTPUT_COLS = ParamInfoFactory
            .createParamInfo("trainOutputCols", String[].class)
            .setDescription("Names of the output columns for train processing")
            .setRequired()
            .build();

    default String[] getTrainOutputCols() {
        return (String[])this.get(TRAIN_OUTPUT_COLS);
    }

    default T setTrainOutputCols(String... value) {
        return this.set(TRAIN_OUTPUT_COLS, value);
    }
}