/*
 * Copyright (c) OSGi Alliance (2010, 2013). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.osgi.service.clusterinfo;

/**
 * Data Transfer Object for a FrameworkNodeStatus Service.
 */
public class FrameworkNodeStatusDTO extends NodeStatusDTO {
	
	/**
	 * The OSGi framework version.
	 */
	public String org_osgi_framework_version;
	
	/**
	 * The OSGi framework processor architecture.
	 */
	public String org_osgi_framework_processor;
	
	/**
	 * The OSGi framework operating system name.
	 */
	public String org_osgi_framework_os_name;
	
	/**
	 * The Java version.
	 */
	public String java_version;
	
	/**
	 * The Java runtime version.
	 */
	public String java_runtime_version;
	
	/**
	 * The Java specification version.
	 */
	public String java_specification_version;
	
	/**
	 * The Java VM version.
	 */
	public String java_vm_version;
	
}
