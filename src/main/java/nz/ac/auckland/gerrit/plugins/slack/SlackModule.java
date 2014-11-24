// Copyright (C) 2014 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package nz.ac.auckland.gerrit.plugins.slack;

import com.google.gerrit.extensions.annotations.PluginName;
import com.google.gerrit.server.config.GerritServerConfig;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import org.eclipse.jgit.lib.Config;

class SlackModule extends AbstractModule {

	private final String pluginName;
	private final Config gerritConfig;

	@Inject
	public SlackModule(@PluginName final String pluginName, @GerritServerConfig final Config config) {
		this.pluginName = pluginName;
		this.gerritConfig = config;
	}

	@Override
	protected void configure() {
		// TODO
	}

}
