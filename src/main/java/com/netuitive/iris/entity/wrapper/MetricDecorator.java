package com.netuitive.iris.entity.wrapper;

import com.netuitive.iris.entity.Metric;
import com.netuitive.iris.entity.SparseDataStrategy;
import com.netuitive.iris.entity.Tag;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lombok.Data;

/**
 *
 * @author john.king
 */
@Data
public class MetricDecorator {
    
    //private Metric metric;
    private Long dataSourceId;
    private String id;
    private String fqn;
    private String name;
    private String unit;
    private String type;
    private SparseDataStrategy sparseDataStrategy;
    private Set<Tag> tags;
    private Map<String, String> netuitiveTags;
    private Map<String, String> sourceTags;
    private Map<String, Boolean> processingFlags;
}
