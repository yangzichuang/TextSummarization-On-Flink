package org.apache.flink.table.ml.lib.tensorflow.param;

import org.apache.flink.ml.api.misc.param.ParamInfo;
import org.apache.flink.ml.api.misc.param.ParamInfoFactory;
import org.apache.flink.ml.api.misc.param.WithParams;

/**
 * An interface for classes with a parameter specifying the name of multiple selected input columns.
 * @param <T> the actual type of this WithParams, as the return type of setter
 */
public interface HasInferenceSelectedCols<T> extends WithParams<T> {
    ParamInfo<String[]> INFERENCE_SELECTED_COLS = ParamInfoFactory
            .createParamInfo("inferenceSelectedCols", String[].class)
            .setDescription("Names of the columns used for inference processing")
            .setRequired()
            .build();

    default String[] getInferenceSelectedCols() {
        return get(INFERENCE_SELECTED_COLS);
    }

    default T setInferenceSelectedCols(String... value) {
        return set(INFERENCE_SELECTED_COLS, value);
    }
}
