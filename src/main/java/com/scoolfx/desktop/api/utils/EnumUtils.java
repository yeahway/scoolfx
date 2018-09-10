package com.scoolfx.desktop.api.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.scoolfx.desktop.api.model.type.ActionType;
import com.scoolfx.desktop.api.model.type.Gender;
import com.scoolfx.desktop.api.model.type.Month;
import com.scoolfx.desktop.api.model.type.Relation;
import com.scoolfx.desktop.api.model.type.Section;
import com.scoolfx.desktop.api.model.type.StaffRole;

/**
 * A supporter class for extracting the values of enumeration.
 * 
 * @author Shekhar Rai
 *
 */
public class EnumUtils {

	/**
	 * Extracts all action type values from the {@link ActionType} enumeration.
	 * 
	 * @param type
	 * @return list of actions
	 */
	public static List<String> actions(ActionType type) {
		return Arrays.asList(type.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getAction())
				.collect(Collectors.toList());
	}

	/**
	 * Extracts all month values from the {@link Month} enumeration.
	 * 
	 * @param month
	 * @return list of months
	 */
	public static List<String> months(Month month) {
		return Arrays.asList(month.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getMonth())
				.collect(Collectors.toList());
	}

	/**
	 * Extracts all gender values from the {@link Gender} enumeration.
	 * 
	 * @param gender
	 * @return list of genders
	 */
	public static List<String> genders(Gender gender) {
		return Arrays.asList(gender.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getGender())
				.collect(Collectors.toList());
	}

	/**
	 * Extracts all relation values from the {@link Relation} enumeration.
	 * 
	 * @param relation
	 * @return list of relations
	 */
	public static List<String> relations(Relation relation) {
		return Arrays.asList(relation.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getRelation())
				.collect(Collectors.toList());
	}

	/**
	 * Extracts all section values from the {@link Section} enumeration.
	 * 
	 * @param section
	 * @return list of relations
	 */
	public static List<String> sections(Section section) {
		return Arrays.asList(section.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getSection())
				.collect(Collectors.toList());
	}

	/**
	 * Extracts all staff role values from the {@link StaffRole} enumerations.
	 * 
	 * @param role
	 * @return list of roles
	 */
	public static List<String> staffRoles(StaffRole role) {
		return Arrays.asList(role.getDeclaringClass().getEnumConstants()).stream().map(e -> e.getRole())
				.collect(Collectors.toList());
	}
}
