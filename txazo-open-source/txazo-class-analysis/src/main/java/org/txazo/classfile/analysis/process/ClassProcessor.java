package org.txazo.classfile.analysis.process;

import org.txazo.classfile.analysis.config.Tag;
import org.txazo.classfile.analysis.core.ClassReader;

import java.util.Map;

public interface ClassProcessor {

    public Map<String, Object> process(Tag tag, ClassReader reader);

}
