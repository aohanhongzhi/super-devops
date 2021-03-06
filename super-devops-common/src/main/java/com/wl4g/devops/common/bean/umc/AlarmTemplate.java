package com.wl4g.devops.common.bean.umc;

import com.wl4g.devops.common.bean.BaseBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.wl4g.devops.common.utils.serialize.JacksonUtils.parseJSON;
import static org.springframework.util.CollectionUtils.isEmpty;

public class AlarmTemplate extends BaseBean implements Serializable {
    private static final long serialVersionUID = 381411777614066880L;


    private String name;

    private String metric;

    private String classify;

    private String tags;

    private Integer notifyLevel;

    private List<AlarmRule> rules = new ArrayList<>();

    private Map<String, String> tagMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric == null ? null : metric.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getNotifyLevel() {
        return notifyLevel;
    }

    public void setNotifyLevel(Integer notifyLevel) {
        this.notifyLevel = notifyLevel;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public void setRules(List<AlarmRule> rules) {
        this.rules = rules;
    }

    public Map<String, String> getTagMap() {
        return tagMap;
    }

    public void setTagMap(Map<String, String> tagMap) {
        this.tagMap = tagMap;
    }

    @SuppressWarnings("unchecked")
    public synchronized Map<String, String> getTagsMap() {
        if (isEmpty(tagMap)) {
            tagMap = parseJSON(getTags(), Map.class);
        }
        return tagMap;
    }
}