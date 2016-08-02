alter table Mobile_API add isTitans tinyint(4) unsigned not null default 0 comment '是否Titans接口, 0否, 1是';
alter table Mobile_API add isTitansPrivate tinyint(4) unsigned not null default 0 comment '是否Titans私有接口, 0否, 1是';
alter table Mobile_API add titansVersion varchar(16) default null comment 'Titans版本';
alter table Mobile_API add messageName varchar(64) default null comment '消息名称';
alter table Mobile_API add jsApiName varchar(64) default null comment 'JS-API名称';
alter table Mobile_API add functionList text comment '函数';


( cd  ./jdk/make && \
	  /Applications/Xcode.app/Contents/Developer/usr/bin/make sanity HOTSPOT_IMPORT_CHECK=false JDK_TOPDIR=/Users/txazo/OpenJdk/openjdk/jdk JDK_MAKE_SHARED_DIR=/Users/txazo/OpenJdk/openjdk/jdk/make/common/shared EXTERNALSANITYCONTROL=true SOURCE_LANGUAGE_VERSION=7 TARGET_CLASS_VERSION=7 MILESTONE=internal BUILD_NUMBER=b00 JDK_BUILD_NUMBER=b00 FULL_VERSION=1.7.0-internal-debug-txazo_2016_08_01_10_40-b00 PREVIOUS_JDK_VERSION=1.6.0 JDK_VERSION=1.7.0 JDK_MKTG_VERSION=7 JDK_MAJOR_VERSION=1 JDK_MINOR_VERSION=7 JDK_MICRO_VERSION=0 PREVIOUS_MAJOR_VERSION=1 PREVIOUS_MINOR_VERSION=6 PREVIOUS_MICRO_VERSION=0 ARCH_DATA_MODEL=64 VARIANT=DBG DEBUG_CLASSFILES=true COOKED_BUILD_NUMBER=0 ANT_HOME="/usr/local/ant" ALT_OUTPUTDIR=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64 ALT_LANGTOOLS_DIST=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/langtools/dist ALT_CORBA_DIST=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/corba/dist ALT_JAXP_DIST=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/jaxp/dist ALT_JAXWS_DIST=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/jaxws/dist ALT_HOTSPOT_IMPORT_PATH=/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/import BUILD_HOTSPOT=true ; )

Build Machine Information:
   build machine = txazo.local

Build Directory Structure:
   CWD = /Users/txazo/OpenJdk/openjdk
   TOPDIR = .
   LANGTOOLS_TOPDIR = ./langtools
   JAXP_TOPDIR = ./jaxp
   JAXWS_TOPDIR = ./jaxws
   CORBA_TOPDIR = ./corba
   HOTSPOT_TOPDIR = ./hotspot
   JDK_TOPDIR = ./jdk

Build Directives:
   BUILD_LANGTOOLS = true
   BUILD_JAXP = true
   BUILD_JAXWS = true
   BUILD_CORBA = true
   BUILD_HOTSPOT = true
   BUILD_JDK    = true
   DEBUG_CLASSFILES =
   DEBUG_BINARIES =

Hotspot Settings:
      HOTSPOT_BUILD_JOBS  =
      HOTSPOT_OUTPUTDIR   = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/outputdir
      HOTSPOT_EXPORT_PATH = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/import




Bootstrap Settings:
  BOOTDIR = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
    ALT_BOOTDIR = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
  BOOT_VER = 1.6.0 [requires at least 1.6]
  OUTPUTDIR = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64
    ALT_OUTPUTDIR = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64
  ABS_OUTPUTDIR = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64

Build Tool Settings:
  SLASH_JAVA = /NOT-SET
    ALT_SLASH_JAVA =
  VARIANT = DBG
  JDK_DEVTOOLS_DIR = /NOT-SET/devtools
    ALT_JDK_DEVTOOLS_DIR =
  ANT_HOME = /usr/local/ant
  UNIXCOMMAND_PATH = /bin/
    ALT_UNIXCOMMAND_PATH =
  COMPILER_PATH = /Applications/Xcode.app/Contents/Developer/usr/bin/
    ALT_COMPILER_PATH =
  DEVTOOLS_PATH = /opt/local/bin/
    ALT_DEVTOOLS_PATH =
  COMPILER_NAME = LLVM-GCC4
  COMPILER_VERSION = LLVM-GCC4
  CC_VER = 4.2.1 [requires at least 4.2.1]
  ZIP_VER = 3.0 [requires at least 2.2]
  UNZIP_VER = 5.52 [requires at least 5.12]
  ANT_VER = 1.9.6 [requires at least 1.7.1]
  TEMPDIR = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/tmp

Build Directives:
  OPENJDK = true
  USE_HOTSPOT_INTERPRETER_MODE =
  PEDANTIC =
  DEV_ONLY =
  NO_DOCS =
  NO_IMAGES =
  TOOLS_ONLY =
  INSANE =
  COMPILE_APPROACH = parallel
  PARALLEL_COMPILE_JOBS = 2
    ALT_PARALLEL_COMPILE_JOBS =
  FASTDEBUG =
  COMPILER_WARNINGS_FATAL = false
  COMPILER_WARNING_LEVEL =
  SHOW_ALL_WARNINGS =
  INCREMENTAL_BUILD = false
  CC_HIGHEST_OPT =
  CC_HIGHER_OPT =
  CC_LOWER_OPT =
  CXXFLAGS =  -g -fPIC -DCC_NOEX -W -Wall  -Wno-unused -Wno-parentheses -m64 -fno-omit-frame-pointer -D_LITTLE_ENDIAN
  CFLAGS =  -g   -fno-strict-aliasing -fPIC -W -Wall  -Wno-unused -Wno-parentheses -pipe -m64 -fno-omit-frame-pointer -D_LITTLE_ENDIAN -F/System/Library/Frameworks/JavaVM.framework/Frameworks -F/System/Library/Frameworks/ApplicationServices.framework/Frameworks
  BOOT_JAVA_CMD = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -XX:-PrintVMOptions -XX:+UnlockDiagnosticVMOptions -XX:-LogVMOutput -Djava.awt.headless=true -Xmx512m -Xms512m -XX:PermSize=32m -XX:MaxPermSize=160m
  BOOT_JAVAC_CMD = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/javac  -J-XX:ThreadStackSize=1536 -J-XX:-PrintVMOptions -J-XX:+UnlockDiagnosticVMOptions -J-XX:-LogVMOutput -J-Djava.awt.headless=true -J-Xmx512m -J-Xms512m -J-XX:PermSize=32m -J-XX:MaxPermSize=160m -encoding ascii -source 6 -target 6 -XDignore.symbol.file=true
  BOOT_JAR_CMD = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/jar
  BOOT_JARSIGNER_CMD = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/jarsigner
  JAVAC_CMD = /NOT-SET/re/jdk/1.7.0/promoted/latest/binaries/macosx-x86_64/bin/javac  -J-XX:ThreadStackSize=1536 -J-XX:-PrintVMOptions -J-XX:+UnlockDiagnosticVMOptions -J-XX:-LogVMOutput -J-Djava.awt.headless=true -J-Xmx512m -J-Xms512m -J-XX:PermSize=32m -J-XX:MaxPermSize=160m  -g -source 7 -target 7 -encoding ascii -Xbootclasspath:/Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/classes
  JAVAH_CMD = /NOT-SET/re/jdk/1.7.0/promoted/latest/binaries/macosx-x86_64/bin/javah -bootclasspath /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/classes
  JAVADOC_CMD = /NOT-SET/re/jdk/1.7.0/promoted/latest/binaries/macosx-x86_64/bin/javadoc -J-XX:-PrintVMOptions -J-XX:+UnlockDiagnosticVMOptions -J-XX:-LogVMOutput -J-Djava.awt.headless=true -J-Xmx512m -J-Xms512m -J-XX:PermSize=32m -J-XX:MaxPermSize=160m -bootclasspath /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/classes

Build Platform Settings:
  USER = txazo
  PLATFORM = macosx
  ARCH = x86_64
  LIBARCH = x86_64
  ARCH_FAMILY = x86_64
  ARCH_DATA_MODEL = 64
  ARCHPROP = x86_64
  OS_VERSION = 14.1.1 [requires at least 11.2]
  OS_VARIANT_NAME = MacOSX
  OS_VARIANT_VERSION = 10.10.2
  MB_OF_MEMORY = 8192

GNU Make Settings:
  MAKE = /Applications/Xcode.app/Contents/Developer/usr/bin/make
  MAKE_VER = 3.81 [requires at least 3.81]
  MAKECMDGOALS = sanity
  MAKEFLAGS =
  SHELL = /bin/sh

Target Build Versions:
  JDK_VERSION = 1.7.0
  MILESTONE = internal
  RELEASE = 1.7.0-internal-debug
  FULL_VERSION = 1.7.0-internal-debug-txazo_2016_08_01_10_40-b00
  BUILD_NUMBER = b00

External File/Binary Locations:
  USRJDKINSTANCES_PATH = /opt/local
  BUILD_JDK_IMPORT_PATH = /NOT-SET/re/jdk/1.7.0/promoted/latest/binaries
    ALT_BUILD_JDK_IMPORT_PATH =
  JDK_IMPORT_PATH = /NOT-SET/re/jdk/1.7.0/promoted/latest/binaries/macosx-x86_64
    ALT_JDK_IMPORT_PATH =
  LANGTOOLS_DIST =
    ALT_LANGTOOLS_DIST = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/langtools/dist
  CORBA_DIST =
    ALT_CORBA_DIST = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/corba/dist
  JAXP_DIST =
    ALT_JAXP_DIST = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/jaxp/dist
  JAXWS_DIST =
    ALT_JAXWS_DIST = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/jaxws/dist
  HOTSPOT_DOCS_IMPORT_PATH = /NO_DOCS_DIR
    ALT_HOTSPOT_DOCS_IMPORT_PATH =
  HOTSPOT_IMPORT_PATH = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/import
    ALT_HOTSPOT_IMPORT_PATH = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/import
  HOTSPOT_SERVER_PATH = /Users/txazo/OpenJdk/openjdk/build/macosx-x86_64/hotspot/import/jre/lib/server
    ALT_HOTSPOT_SERVER_PATH =
  CACERTS_FILE = ./../src/share/lib/security/cacerts
    ALT_CACERTS_FILE =
  CUPS_HEADERS_PATH = /usr/local/cups-2.1.4/include
    ALT_CUPS_HEADERS_PATH = /usr/local/cups-2.1.4/include

OpenJDK-specific settings:
  FREETYPE_HEADERS_PATH = /usr/X11R6/include
    ALT_FREETYPE_HEADERS_PATH =
  FREETYPE_LIB_PATH = /usr/X11R6/lib
    ALT_FREETYPE_LIB_PATH =

Previous JDK Settings:
  PREVIOUS_RELEASE_PATH = USING-PREVIOUS_RELEASE_IMAGE
    ALT_PREVIOUS_RELEASE_PATH =
  PREVIOUS_JDK_VERSION = 1.6.0
    ALT_PREVIOUS_JDK_VERSION =
  PREVIOUS_JDK_FILE =
    ALT_PREVIOUS_JDK_FILE =
  PREVIOUS_JRE_FILE =
    ALT_PREVIOUS_JRE_FILE =
  PREVIOUS_RELEASE_IMAGE = /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
    ALT_PREVIOUS_RELEASE_IMAGE =


Sanity check passed.