include_defs('//bucklets/gerrit_plugin.bucklet')

gerrit_plugin(
  name = 'slack-notification',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  manifest_entries = [
    'Gerrit-PluginName: slack-notification',
    'Gerrit-ApiType: plugin',
    'Gerrit-ApiVersion: 2.9.1',
    'Gerrit-Module: nz.ac.auckland.gerrit.plugins.slack.Module',
    'Gerrit-SshModule: nz.ac.auckland.gerrit.plugins.slack.SshModule',
    'Gerrit-HttpModule: nz.ac.auckland.gerrit.plugins.slack.HttpModule',
  ],
)

# this is required for bucklets/tools/eclipse/project.py to work
java_library(
  name = 'classpath',
  deps = [':slack-notification__plugin'],
)

