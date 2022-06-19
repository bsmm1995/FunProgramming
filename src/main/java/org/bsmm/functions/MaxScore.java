package org.bsmm.functions;

import org.bsmm.domain.Dto;

import java.util.List;

@FunctionalInterface
public interface MaxScore {
    double calculate(List<Dto> data);
}
