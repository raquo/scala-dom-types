// This test the base plugin ScalaDomTypesPlugin, which would never
// be enabled directly by a user, but only as a dependency of another
// plugin. We test it here to make sure it doesn't break anything.

enablePlugins(ScalaDomTypesPlugin)
