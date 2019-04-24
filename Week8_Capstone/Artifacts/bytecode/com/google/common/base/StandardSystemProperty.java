public final class com.google.common.base.StandardSystemProperty extends java.lang.Enum<com.google.common.base.StandardSystemProperty> {
  public static final com.google.common.base.StandardSystemProperty FILE_SEPARATOR;

  public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_PATH;

  public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_VERSION;

  public static final com.google.common.base.StandardSystemProperty JAVA_COMPILER;

  public static final com.google.common.base.StandardSystemProperty JAVA_EXT_DIRS;

  public static final com.google.common.base.StandardSystemProperty JAVA_HOME;

  public static final com.google.common.base.StandardSystemProperty JAVA_IO_TMPDIR;

  public static final com.google.common.base.StandardSystemProperty JAVA_LIBRARY_PATH;

  public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_NAME;

  public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VENDOR;

  public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VERSION;

  public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR;

  public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR_URL;

  public static final com.google.common.base.StandardSystemProperty JAVA_VERSION;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_NAME;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_NAME;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VENDOR;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VERSION;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_VENDOR;

  public static final com.google.common.base.StandardSystemProperty JAVA_VM_VERSION;

  public static final com.google.common.base.StandardSystemProperty LINE_SEPARATOR;

  public static final com.google.common.base.StandardSystemProperty OS_ARCH;

  public static final com.google.common.base.StandardSystemProperty OS_NAME;

  public static final com.google.common.base.StandardSystemProperty OS_VERSION;

  public static final com.google.common.base.StandardSystemProperty PATH_SEPARATOR;

  public static final com.google.common.base.StandardSystemProperty USER_DIR;

  public static final com.google.common.base.StandardSystemProperty USER_HOME;

  public static final com.google.common.base.StandardSystemProperty USER_NAME;

  static {};
    Code:
       0: new           #2                  // class com/google/common/base/StandardSystemProperty
       3: dup
       4: ldc           #41                 // String JAVA_VERSION
       6: iconst_0
       7: ldc           #43                 // String java.version
       9: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      12: putstatic     #49                 // Field JAVA_VERSION:Lcom/google/common/base/StandardSystemProperty;
      15: new           #2                  // class com/google/common/base/StandardSystemProperty
      18: dup
      19: ldc           #50                 // String JAVA_VENDOR
      21: iconst_1
      22: ldc           #52                 // String java.vendor
      24: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      27: putstatic     #54                 // Field JAVA_VENDOR:Lcom/google/common/base/StandardSystemProperty;
      30: new           #2                  // class com/google/common/base/StandardSystemProperty
      33: dup
      34: ldc           #55                 // String JAVA_VENDOR_URL
      36: iconst_2
      37: ldc           #57                 // String java.vendor.url
      39: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      42: putstatic     #59                 // Field JAVA_VENDOR_URL:Lcom/google/common/base/StandardSystemProperty;
      45: new           #2                  // class com/google/common/base/StandardSystemProperty
      48: dup
      49: ldc           #60                 // String JAVA_HOME
      51: iconst_3
      52: ldc           #62                 // String java.home
      54: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      57: putstatic     #64                 // Field JAVA_HOME:Lcom/google/common/base/StandardSystemProperty;
      60: new           #2                  // class com/google/common/base/StandardSystemProperty
      63: dup
      64: ldc           #65                 // String JAVA_VM_SPECIFICATION_VERSION
      66: iconst_4
      67: ldc           #67                 // String java.vm.specification.version
      69: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      72: putstatic     #69                 // Field JAVA_VM_SPECIFICATION_VERSION:Lcom/google/common/base/StandardSystemProperty;
      75: new           #2                  // class com/google/common/base/StandardSystemProperty
      78: dup
      79: ldc           #70                 // String JAVA_VM_SPECIFICATION_VENDOR
      81: iconst_5
      82: ldc           #72                 // String java.vm.specification.vendor
      84: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
      87: putstatic     #74                 // Field JAVA_VM_SPECIFICATION_VENDOR:Lcom/google/common/base/StandardSystemProperty;
      90: new           #2                  // class com/google/common/base/StandardSystemProperty
      93: dup
      94: ldc           #75                 // String JAVA_VM_SPECIFICATION_NAME
      96: bipush        6
      98: ldc           #77                 // String java.vm.specification.name
     100: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     103: putstatic     #79                 // Field JAVA_VM_SPECIFICATION_NAME:Lcom/google/common/base/StandardSystemProperty;
     106: new           #2                  // class com/google/common/base/StandardSystemProperty
     109: dup
     110: ldc           #80                 // String JAVA_VM_VERSION
     112: bipush        7
     114: ldc           #82                 // String java.vm.version
     116: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     119: putstatic     #84                 // Field JAVA_VM_VERSION:Lcom/google/common/base/StandardSystemProperty;
     122: new           #2                  // class com/google/common/base/StandardSystemProperty
     125: dup
     126: ldc           #85                 // String JAVA_VM_VENDOR
     128: bipush        8
     130: ldc           #87                 // String java.vm.vendor
     132: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     135: putstatic     #89                 // Field JAVA_VM_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     138: new           #2                  // class com/google/common/base/StandardSystemProperty
     141: dup
     142: ldc           #90                 // String JAVA_VM_NAME
     144: bipush        9
     146: ldc           #92                 // String java.vm.name
     148: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     151: putstatic     #94                 // Field JAVA_VM_NAME:Lcom/google/common/base/StandardSystemProperty;
     154: new           #2                  // class com/google/common/base/StandardSystemProperty
     157: dup
     158: ldc           #95                 // String JAVA_SPECIFICATION_VERSION
     160: bipush        10
     162: ldc           #97                 // String java.specification.version
     164: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     167: putstatic     #99                 // Field JAVA_SPECIFICATION_VERSION:Lcom/google/common/base/StandardSystemProperty;
     170: new           #2                  // class com/google/common/base/StandardSystemProperty
     173: dup
     174: ldc           #100                // String JAVA_SPECIFICATION_VENDOR
     176: bipush        11
     178: ldc           #102                // String java.specification.vendor
     180: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     183: putstatic     #104                // Field JAVA_SPECIFICATION_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     186: new           #2                  // class com/google/common/base/StandardSystemProperty
     189: dup
     190: ldc           #105                // String JAVA_SPECIFICATION_NAME
     192: bipush        12
     194: ldc           #107                // String java.specification.name
     196: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     199: putstatic     #109                // Field JAVA_SPECIFICATION_NAME:Lcom/google/common/base/StandardSystemProperty;
     202: new           #2                  // class com/google/common/base/StandardSystemProperty
     205: dup
     206: ldc           #110                // String JAVA_CLASS_VERSION
     208: bipush        13
     210: ldc           #112                // String java.class.version
     212: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     215: putstatic     #114                // Field JAVA_CLASS_VERSION:Lcom/google/common/base/StandardSystemProperty;
     218: new           #2                  // class com/google/common/base/StandardSystemProperty
     221: dup
     222: ldc           #115                // String JAVA_CLASS_PATH
     224: bipush        14
     226: ldc           #117                // String java.class.path
     228: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     231: putstatic     #119                // Field JAVA_CLASS_PATH:Lcom/google/common/base/StandardSystemProperty;
     234: new           #2                  // class com/google/common/base/StandardSystemProperty
     237: dup
     238: ldc           #120                // String JAVA_LIBRARY_PATH
     240: bipush        15
     242: ldc           #122                // String java.library.path
     244: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     247: putstatic     #124                // Field JAVA_LIBRARY_PATH:Lcom/google/common/base/StandardSystemProperty;
     250: new           #2                  // class com/google/common/base/StandardSystemProperty
     253: dup
     254: ldc           #125                // String JAVA_IO_TMPDIR
     256: bipush        16
     258: ldc           #127                // String java.io.tmpdir
     260: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     263: putstatic     #129                // Field JAVA_IO_TMPDIR:Lcom/google/common/base/StandardSystemProperty;
     266: new           #2                  // class com/google/common/base/StandardSystemProperty
     269: dup
     270: ldc           #130                // String JAVA_COMPILER
     272: bipush        17
     274: ldc           #132                // String java.compiler
     276: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     279: putstatic     #134                // Field JAVA_COMPILER:Lcom/google/common/base/StandardSystemProperty;
     282: new           #2                  // class com/google/common/base/StandardSystemProperty
     285: dup
     286: ldc           #135                // String JAVA_EXT_DIRS
     288: bipush        18
     290: ldc           #137                // String java.ext.dirs
     292: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     295: putstatic     #139                // Field JAVA_EXT_DIRS:Lcom/google/common/base/StandardSystemProperty;
     298: new           #2                  // class com/google/common/base/StandardSystemProperty
     301: dup
     302: ldc           #140                // String OS_NAME
     304: bipush        19
     306: ldc           #142                // String os.name
     308: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     311: putstatic     #144                // Field OS_NAME:Lcom/google/common/base/StandardSystemProperty;
     314: new           #2                  // class com/google/common/base/StandardSystemProperty
     317: dup
     318: ldc           #145                // String OS_ARCH
     320: bipush        20
     322: ldc           #147                // String os.arch
     324: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     327: putstatic     #149                // Field OS_ARCH:Lcom/google/common/base/StandardSystemProperty;
     330: new           #2                  // class com/google/common/base/StandardSystemProperty
     333: dup
     334: ldc           #150                // String OS_VERSION
     336: bipush        21
     338: ldc           #152                // String os.version
     340: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     343: putstatic     #154                // Field OS_VERSION:Lcom/google/common/base/StandardSystemProperty;
     346: new           #2                  // class com/google/common/base/StandardSystemProperty
     349: dup
     350: ldc           #155                // String FILE_SEPARATOR
     352: bipush        22
     354: ldc           #157                // String file.separator
     356: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     359: putstatic     #159                // Field FILE_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     362: new           #2                  // class com/google/common/base/StandardSystemProperty
     365: dup
     366: ldc           #160                // String PATH_SEPARATOR
     368: bipush        23
     370: ldc           #162                // String path.separator
     372: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     375: putstatic     #164                // Field PATH_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     378: new           #2                  // class com/google/common/base/StandardSystemProperty
     381: dup
     382: ldc           #165                // String LINE_SEPARATOR
     384: bipush        24
     386: ldc           #167                // String line.separator
     388: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     391: putstatic     #169                // Field LINE_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     394: new           #2                  // class com/google/common/base/StandardSystemProperty
     397: dup
     398: ldc           #170                // String USER_NAME
     400: bipush        25
     402: ldc           #172                // String user.name
     404: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     407: putstatic     #174                // Field USER_NAME:Lcom/google/common/base/StandardSystemProperty;
     410: new           #2                  // class com/google/common/base/StandardSystemProperty
     413: dup
     414: ldc           #175                // String USER_HOME
     416: bipush        26
     418: ldc           #177                // String user.home
     420: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     423: putstatic     #179                // Field USER_HOME:Lcom/google/common/base/StandardSystemProperty;
     426: new           #2                  // class com/google/common/base/StandardSystemProperty
     429: dup
     430: ldc           #180                // String USER_DIR
     432: bipush        27
     434: ldc           #182                // String user.dir
     436: invokespecial #47                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;)V
     439: putstatic     #184                // Field USER_DIR:Lcom/google/common/base/StandardSystemProperty;
     442: bipush        28
     444: anewarray     #2                  // class com/google/common/base/StandardSystemProperty
     447: dup
     448: iconst_0
     449: getstatic     #49                 // Field JAVA_VERSION:Lcom/google/common/base/StandardSystemProperty;
     452: aastore
     453: dup
     454: iconst_1
     455: getstatic     #54                 // Field JAVA_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     458: aastore
     459: dup
     460: iconst_2
     461: getstatic     #59                 // Field JAVA_VENDOR_URL:Lcom/google/common/base/StandardSystemProperty;
     464: aastore
     465: dup
     466: iconst_3
     467: getstatic     #64                 // Field JAVA_HOME:Lcom/google/common/base/StandardSystemProperty;
     470: aastore
     471: dup
     472: iconst_4
     473: getstatic     #69                 // Field JAVA_VM_SPECIFICATION_VERSION:Lcom/google/common/base/StandardSystemProperty;
     476: aastore
     477: dup
     478: iconst_5
     479: getstatic     #74                 // Field JAVA_VM_SPECIFICATION_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     482: aastore
     483: dup
     484: bipush        6
     486: getstatic     #79                 // Field JAVA_VM_SPECIFICATION_NAME:Lcom/google/common/base/StandardSystemProperty;
     489: aastore
     490: dup
     491: bipush        7
     493: getstatic     #84                 // Field JAVA_VM_VERSION:Lcom/google/common/base/StandardSystemProperty;
     496: aastore
     497: dup
     498: bipush        8
     500: getstatic     #89                 // Field JAVA_VM_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     503: aastore
     504: dup
     505: bipush        9
     507: getstatic     #94                 // Field JAVA_VM_NAME:Lcom/google/common/base/StandardSystemProperty;
     510: aastore
     511: dup
     512: bipush        10
     514: getstatic     #99                 // Field JAVA_SPECIFICATION_VERSION:Lcom/google/common/base/StandardSystemProperty;
     517: aastore
     518: dup
     519: bipush        11
     521: getstatic     #104                // Field JAVA_SPECIFICATION_VENDOR:Lcom/google/common/base/StandardSystemProperty;
     524: aastore
     525: dup
     526: bipush        12
     528: getstatic     #109                // Field JAVA_SPECIFICATION_NAME:Lcom/google/common/base/StandardSystemProperty;
     531: aastore
     532: dup
     533: bipush        13
     535: getstatic     #114                // Field JAVA_CLASS_VERSION:Lcom/google/common/base/StandardSystemProperty;
     538: aastore
     539: dup
     540: bipush        14
     542: getstatic     #119                // Field JAVA_CLASS_PATH:Lcom/google/common/base/StandardSystemProperty;
     545: aastore
     546: dup
     547: bipush        15
     549: getstatic     #124                // Field JAVA_LIBRARY_PATH:Lcom/google/common/base/StandardSystemProperty;
     552: aastore
     553: dup
     554: bipush        16
     556: getstatic     #129                // Field JAVA_IO_TMPDIR:Lcom/google/common/base/StandardSystemProperty;
     559: aastore
     560: dup
     561: bipush        17
     563: getstatic     #134                // Field JAVA_COMPILER:Lcom/google/common/base/StandardSystemProperty;
     566: aastore
     567: dup
     568: bipush        18
     570: getstatic     #139                // Field JAVA_EXT_DIRS:Lcom/google/common/base/StandardSystemProperty;
     573: aastore
     574: dup
     575: bipush        19
     577: getstatic     #144                // Field OS_NAME:Lcom/google/common/base/StandardSystemProperty;
     580: aastore
     581: dup
     582: bipush        20
     584: getstatic     #149                // Field OS_ARCH:Lcom/google/common/base/StandardSystemProperty;
     587: aastore
     588: dup
     589: bipush        21
     591: getstatic     #154                // Field OS_VERSION:Lcom/google/common/base/StandardSystemProperty;
     594: aastore
     595: dup
     596: bipush        22
     598: getstatic     #159                // Field FILE_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     601: aastore
     602: dup
     603: bipush        23
     605: getstatic     #164                // Field PATH_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     608: aastore
     609: dup
     610: bipush        24
     612: getstatic     #169                // Field LINE_SEPARATOR:Lcom/google/common/base/StandardSystemProperty;
     615: aastore
     616: dup
     617: bipush        25
     619: getstatic     #174                // Field USER_NAME:Lcom/google/common/base/StandardSystemProperty;
     622: aastore
     623: dup
     624: bipush        26
     626: getstatic     #179                // Field USER_HOME:Lcom/google/common/base/StandardSystemProperty;
     629: aastore
     630: dup
     631: bipush        27
     633: getstatic     #184                // Field USER_DIR:Lcom/google/common/base/StandardSystemProperty;
     636: aastore
     637: putstatic     #186                // Field $VALUES:[Lcom/google/common/base/StandardSystemProperty;
     640: return

  public static com.google.common.base.StandardSystemProperty valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class com/google/common/base/StandardSystemProperty
       2: aload_0
       3: invokestatic  #199                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class com/google/common/base/StandardSystemProperty
       9: areturn

  public static com.google.common.base.StandardSystemProperty[] values();
    Code:
       0: getstatic     #186                // Field $VALUES:[Lcom/google/common/base/StandardSystemProperty;
       3: invokevirtual #206                // Method "[Lcom/google/common/base/StandardSystemProperty;".clone:()Ljava/lang/Object;
       6: checkcast     #202                // class "[Lcom/google/common/base/StandardSystemProperty;"
       9: areturn

  public java.lang.String key();
    Code:
       0: aload_0
       1: getfield      #192                // Field key:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #210                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #212                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: invokevirtual #214                // Method key:()Ljava/lang/String;
      13: invokevirtual #218                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: ldc           #220                // String =
      20: invokevirtual #218                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: aload_0
      26: invokevirtual #223                // Method value:()Ljava/lang/String;
      29: invokevirtual #218                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: invokevirtual #225                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      37: areturn

  public java.lang.String value();
    Code:
       0: aload_0
       1: getfield      #192                // Field key:Ljava/lang/String;
       4: invokestatic  #231                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
       7: areturn
}
