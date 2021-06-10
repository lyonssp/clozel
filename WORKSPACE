load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

# maven dependencies
RULES_JVM_EXTERNAL_TAG = "4.0"
RULES_JVM_EXTERNAL_SHA = "31701ad93dbfe544d597dbe62c9a1fdd76d81d8a9150c2bf1ecf928ecdf97169"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
load("@rules_jvm_external//:specs.bzl", "maven")
load("@rules_jvm_external//:defs.bzl", "maven_install")

# griffinbank/rules_clojure
http_archive(
    name = "bazel_skylib",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.0.3/bazel-skylib-1.0.3.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.0.3/bazel-skylib-1.0.3.tar.gz",
    ],
    sha256 = "1c531376ac7e5a180e0237938a2536de0c54d93f5c278634818e0efc952dd56c",
)
load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")
bazel_skylib_workspace()

git_repository(
    name = "rules_clojure",
    commit = "cc0a746c0d225ccd36c41f90c90bf55ce30e5ec4",
    remote = "https://github.com/griffinbank/rules_clojure.git"
)

load("@rules_clojure//:repositories.bzl", "rules_clojure_dependencies")
load("@rules_clojure//:toolchains.bzl", "rules_clojure_default_toolchain")
load("@rules_clojure//rules:tools_deps.bzl", "clojure_tools_deps")

rules_clojure_dependencies()
rules_clojure_default_toolchain()

clojure_tools_deps(
    name = "deps",
    clj_version = "1.10.1.763",
    deps_edn = "//:deps.edn",
    aliases = []
)

