package ${package};

import org.devocative.adroit.IConfigKey;

import java.util.List;

public enum ${ModuleName}ConfigKey implements IConfigKey {
	//UseEqualOnUpperBound("mts.range.equal.upper", false, Arrays.asList(true, false)),
	;
	// ------------------------------

	private String key;
	private boolean validate = false;
	private Object defaultValue;
	private List<?> possibilities;

	// ------------------------------

	${ModuleName}ConfigKey(String key) {
		this(false, key, null);
	}

	${ModuleName}ConfigKey(String key, List<?> possibilities) {
		this(false, key, possibilities);
	}

	${ModuleName}ConfigKey(boolean validate, String key) {
		this(validate, key, null);
	}

	// Main Constructor 1
	${ModuleName}ConfigKey(boolean validate, String key, List<?> possibilities) {
		this.key = key;
		this.validate = validate;
		this.possibilities = possibilities;
	}

	// ---------------

	${ModuleName}ConfigKey(String key, Object defaultValue) {
		this(key, defaultValue, null);
	}

	// Main Constructor 2
	${ModuleName}ConfigKey(String key, Object defaultValue, List<?> possibilities) {
		this.key = key;
		this.defaultValue = defaultValue;
		this.possibilities = possibilities;
	}

	// ------------------------------

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public boolean getValidate() {
		return validate;
	}

	@Override
	public Object getDefaultValue() {
		return defaultValue;
	}

	@Override
	public List<?> getPossibleValues() {
		return possibilities;
	}
}
