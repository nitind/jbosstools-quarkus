/*
 * Copyright 2019 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.quarkus.eclipse.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.jupiter.api.Test;

public class ProjectUtilsTest {
	
	@Test
	public void testCreate() {
		IProject project = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getProject("com.acme.quarkus");
		assertFalse(project.exists());
		ProjectUtils.createProject(
				"com.acme.quarkus", 
				"com.acme", 
				"quarkus", 
				"1.0.0-SHAPSHOT", 
				null);
		assertTrue(project.exists());
	}
	
}
