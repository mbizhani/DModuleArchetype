package ${package};

import org.devocative.demeter.imodule.DModuleException;

import java.util.Collections;
import java.util.List;

public class ${ModuleName}Exception extends DModuleException {
	private static final long serialVersionUID = 1L;

	public ${ModuleName}Exception(${ModuleName}ErrorCode errorCode) {
		this(errorCode, null, null);
	}

	public ${ModuleName}Exception(${ModuleName}ErrorCode errorCode, String errorParameter) {
		this(errorCode, errorParameter, null);
	}

	public ${ModuleName}Exception(${ModuleName}ErrorCode errorCode, Throwable cause) {
		this(errorCode, null, cause);
	}

	// Main Constructor
	public ${ModuleName}Exception(${ModuleName}ErrorCode errorCode, String errorParameter, Throwable cause) {
		super("${ModuleShortName}", errorCode, errorParameter, cause);
	}
}