package com.querydsltips.filtering.modules.users.predicate;

import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsltips.filtering.modules.users.filter.UserFilter;
import com.querydsltips.filtering.modules.users.domain.QUser;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserPredicateFactory {

    private UserPredicateFactory() {
    }

    public static Predicate createUserFilterPredicate(UserFilter userFilter) {
        List<Predicate> predicates = new ArrayList<>();
        if(userFilter != null) {
            predicates = prepareFilterPredicate(userFilter);
        }
        return ExpressionUtils.allOf(predicates);
    }

    private static List<Predicate> prepareFilterPredicate(UserFilter filter) {
        List<Predicate> predicates = new ArrayList<>();
        QUser qUser = QUser.user;
        if(StringUtils.isNotBlank(filter.getFirstName())) {
            predicates.add(qUser.firstName.contains(filter.getFirstName().trim()));
        }
        if(StringUtils.isNotBlank(filter.getLastName())) {
            predicates.add(qUser.firstName.contains(filter.getLastName().trim()));
        }
        if(StringUtils.isNotBlank(filter.getUsername())) {
            predicates.add(qUser.username.contains(filter.getUsername().trim()));
        }
        return predicates;
    }
}
