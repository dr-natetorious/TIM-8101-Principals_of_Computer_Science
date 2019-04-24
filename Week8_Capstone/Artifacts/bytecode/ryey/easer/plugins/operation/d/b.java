public class ryey.easer.plugins.operation.d.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.d.b> CREATOR;

  ryey.easer.plugins.operation.d.f a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/d/b$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/plugins/operation/d/b$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.d.b(android.os.Parcel, ryey.easer.plugins.operation.d.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #47                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.d.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #29                 // class ryey/easer/plugins/operation/d/f
       8: dup
       9: invokespecial #30                 // Method ryey/easer/plugins/operation/d/f."<init>":()V
      12: putfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      15: aload_0
      16: aload_1
      17: aload_2
      18: iload_3
      19: invokevirtual #50                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      22: return

  ryey.easer.plugins.operation.d.b(ryey.easer.plugins.operation.d.f);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #29                 // class ryey/easer/plugins/operation/d/f
       8: dup
       9: invokespecial #30                 // Method ryey/easer/plugins/operation/d/f."<init>":()V
      12: putfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      15: aload_0
      16: aload_1
      17: putfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      20: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #57                 // Field ryey/easer/plugins/operation/d/b$2.a:[I
       3: aload_1
       4: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #65                 // class org/json/JSONObject
      12: dup
      13: invokespecial #66                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #68                 // String action
      20: aload_0
      21: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      24: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      27: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_0
      32: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      35: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      38: ifnull        114
      41: aload_0
      42: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      45: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      48: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
      53: ifle          114
      56: new           #84                 // class org/json/JSONArray
      59: dup
      60: invokespecial #85                 // Method org/json/JSONArray."<init>":()V
      63: astore_3
      64: aload_0
      65: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      68: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      71: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      76: astore        4
      78: aload         4
      80: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      85: ifeq          106
      88: aload_3
      89: aload         4
      91: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      96: checkcast     #101                // class java/lang/String
      99: invokevirtual #104                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
     102: pop
     103: goto          78
     106: aload_1
     107: ldc           #106                // String category
     109: aload_3
     110: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     113: pop
     114: aload_0
     115: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     118: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     121: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
     124: ifne          141
     127: aload_1
     128: ldc           #116                // String type
     130: aload_0
     131: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     134: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     137: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     140: pop
     141: aload_0
     142: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     145: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     148: ifnull        168
     151: aload_1
     152: ldc           #122                // String data
     154: aload_0
     155: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     158: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     161: invokevirtual #128                // Method android/net/Uri.toString:()Ljava/lang/String;
     164: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     167: pop
     168: aload_0
     169: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     172: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     175: ifnull        303
     178: aload_0
     179: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     182: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     185: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
     190: ifle          303
     193: new           #84                 // class org/json/JSONArray
     196: dup
     197: invokespecial #85                 // Method org/json/JSONArray."<init>":()V
     200: astore_3
     201: aload_0
     202: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     205: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     208: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     213: astore        4
     215: aload         4
     217: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     222: ifeq          295
     225: aload         4
     227: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     232: checkcast     #133                // class ryey/easer/plugins/operation/d/f$a
     235: astore        5
     237: new           #65                 // class org/json/JSONObject
     240: dup
     241: invokespecial #66                 // Method org/json/JSONObject."<init>":()V
     244: astore        6
     246: aload         6
     248: ldc           #135                // String key
     250: aload         5
     252: getfield      #136                // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
     255: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     258: pop
     259: aload         6
     261: ldc           #138                // String value
     263: aload         5
     265: getfield      #140                // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
     268: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     271: pop
     272: aload         6
     274: ldc           #116                // String type
     276: aload         5
     278: getfield      #141                // Field ryey/easer/plugins/operation/d/f$a.c:Ljava/lang/String;
     281: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     284: pop
     285: aload_3
     286: aload         6
     288: invokevirtual #104                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
     291: pop
     292: goto          215
     295: aload_1
     296: ldc           #143                // String extras
     298: aload_3
     299: invokevirtual #74                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
     302: pop
     303: aload_1
     304: invokevirtual #144                // Method org/json/JSONObject.toString:()Ljava/lang/String;
     307: astore_1
     308: aload_1
     309: areturn
     310: astore_1
     311: aload_1
     312: invokestatic  #149                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     315: ldc           #151                // String
     317: areturn
    Exception table:
       from    to  target type
          17    78   310   Class org/json/JSONException
          78   103   310   Class org/json/JSONException
         106   114   310   Class org/json/JSONException
         114   141   310   Class org/json/JSONException
         141   168   310   Class org/json/JSONException
         168   215   310   Class org/json/JSONException
         215   292   310   Class org/json/JSONException
         295   303   310   Class org/json/JSONException
         303   308   310   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: new           #29                 // class ryey/easer/plugins/operation/d/f
       3: dup
       4: invokespecial #30                 // Method ryey/easer/plugins/operation/d/f."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      12: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      15: ifnull        33
      18: aload_2
      19: aload_0
      20: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      23: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      26: aload_1
      27: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
      30: putfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      33: aload_0
      34: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      37: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      40: ifnull        118
      43: aload_2
      44: new           #157                // class java/util/ArrayList
      47: dup
      48: aload_0
      49: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      52: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      55: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
      60: invokespecial #160                // Method java/util/ArrayList."<init>":(I)V
      63: putfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      66: aload_0
      67: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      70: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      73: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      78: astore_3
      79: aload_3
      80: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      85: ifeq          118
      88: aload_3
      89: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      94: checkcast     #101                // class java/lang/String
      97: astore        4
      99: aload_2
     100: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
     103: aload         4
     105: aload_1
     106: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
     109: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     114: pop
     115: goto          79
     118: aload_0
     119: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     122: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     125: ifnull        143
     128: aload_2
     129: aload_0
     130: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     133: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     136: aload_1
     137: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
     140: putfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     143: aload_0
     144: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     147: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     150: ifnull        174
     153: aload_2
     154: aload_0
     155: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     158: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     161: invokevirtual #167                // Method android/net/Uri.getPath:()Ljava/lang/String;
     164: aload_1
     165: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
     168: invokestatic  #171                // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
     171: putfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     174: aload_0
     175: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     178: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     181: ifnull        283
     184: aload_2
     185: new           #157                // class java/util/ArrayList
     188: dup
     189: invokespecial #172                // Method java/util/ArrayList."<init>":()V
     192: putfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     195: aload_0
     196: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     199: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     202: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     207: astore_3
     208: aload_3
     209: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     214: ifeq          283
     217: aload_3
     218: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     223: checkcast     #133                // class ryey/easer/plugins/operation/d/f$a
     226: astore        6
     228: aload         6
     230: getfield      #136                // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
     233: aload_1
     234: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
     237: astore        4
     239: aload         6
     241: getfield      #140                // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
     244: aload_1
     245: invokestatic  #155                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
     248: astore        5
     250: aload         6
     252: getfield      #141                // Field ryey/easer/plugins/operation/d/f$a.c:Ljava/lang/String;
     255: astore        6
     257: aload_2
     258: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     261: new           #133                // class ryey/easer/plugins/operation/d/f$a
     264: dup
     265: aload         4
     267: aload         5
     269: aload         6
     271: invokespecial #175                // Method ryey/easer/plugins/operation/d/f$a."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
     274: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     279: pop
     280: goto          208
     283: new           #2                  // class ryey/easer/plugins/operation/d/b
     286: dup
     287: aload_2
     288: invokespecial #177                // Method "<init>":(Lryey/easer/plugins/operation/d/f;)V
     291: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #57                 // Field ryey/easer/plugins/operation/d/b$2.a:[I
       3: aload_2
       4: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #65                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #180                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_2
      18: new           #29                 // class ryey/easer/plugins/operation/d/f
      21: dup
      22: invokespecial #30                 // Method ryey/easer/plugins/operation/d/f."<init>":()V
      25: astore_1
      26: aload_1
      27: aload_2
      28: ldc           #68                 // String action
      30: aconst_null
      31: invokevirtual #184                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      34: putfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      37: aload_2
      38: ldc           #106                // String category
      40: invokevirtual #188                // Method org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
      43: astore        5
      45: iconst_0
      46: istore        4
      48: aload         5
      50: ifnull        111
      53: aload         5
      55: invokevirtual #191                // Method org/json/JSONArray.length:()I
      58: ifle          111
      61: aload_1
      62: new           #157                // class java/util/ArrayList
      65: dup
      66: aload         5
      68: invokevirtual #191                // Method org/json/JSONArray.length:()I
      71: invokespecial #160                // Method java/util/ArrayList."<init>":(I)V
      74: putfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      77: iconst_0
      78: istore_3
      79: iload_3
      80: aload         5
      82: invokevirtual #191                // Method org/json/JSONArray.length:()I
      85: if_icmpge     111
      88: aload_1
      89: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      92: aload         5
      94: iload_3
      95: invokevirtual #195                // Method org/json/JSONArray.getString:(I)Ljava/lang/String;
      98: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     103: pop
     104: iload_3
     105: iconst_1
     106: iadd
     107: istore_3
     108: goto          79
     111: aload_1
     112: aload_2
     113: ldc           #116                // String type
     115: aconst_null
     116: invokevirtual #184                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
     119: putfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     122: aload_2
     123: ldc           #122                // String data
     125: aconst_null
     126: invokevirtual #184                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
     129: astore        5
     131: aload         5
     133: ifnull        145
     136: aload_1
     137: aload         5
     139: invokestatic  #171                // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
     142: putfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     145: aload_2
     146: ldc           #143                // String extras
     148: invokevirtual #188                // Method org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
     151: astore_2
     152: aload_2
     153: ifnull        246
     156: aload_1
     157: new           #157                // class java/util/ArrayList
     160: dup
     161: aload_2
     162: invokevirtual #191                // Method org/json/JSONArray.length:()I
     165: invokespecial #160                // Method java/util/ArrayList."<init>":(I)V
     168: putfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     171: iload         4
     173: istore_3
     174: iload_3
     175: aload_2
     176: invokevirtual #191                // Method org/json/JSONArray.length:()I
     179: if_icmpge     246
     182: aload_2
     183: iload_3
     184: invokevirtual #199                // Method org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
     187: astore        7
     189: aload         7
     191: ldc           #135                // String key
     193: invokevirtual #202                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
     196: astore        5
     198: aload         7
     200: ldc           #138                // String value
     202: invokevirtual #202                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
     205: astore        6
     207: aload         7
     209: ldc           #116                // String type
     211: invokevirtual #202                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
     214: astore        7
     216: aload_1
     217: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     220: new           #133                // class ryey/easer/plugins/operation/d/f$a
     223: dup
     224: aload         5
     226: aload         6
     228: aload         7
     230: invokespecial #175                // Method ryey/easer/plugins/operation/d/f$a."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
     233: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     238: pop
     239: iload_3
     240: iconst_1
     241: iadd
     242: istore_3
     243: goto          174
     246: aload_0
     247: aload_1
     248: putfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     251: return
     252: astore_1
     253: aload_1
     254: invokestatic  #149                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     257: new           #204                // class ryey/easer/commons/local_plugin/b
     260: dup
     261: aload_1
     262: invokespecial #207                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
     265: athrow
    Exception table:
       from    to  target type
           9    45   252   Class org/json/JSONException
          53    77   252   Class org/json/JSONException
          79   104   252   Class org/json/JSONException
         111   131   252   Class org/json/JSONException
         136   145   252   Class org/json/JSONException
         145   152   252   Class org/json/JSONException
         156   171   252   Class org/json/JSONException
         174   239   252   Class org/json/JSONException
         246   251   252   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
       4: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
       7: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      10: ifne          15
      13: iconst_1
      14: ireturn
      15: aload_0
      16: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      19: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      22: ifnull        42
      25: aload_0
      26: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      29: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      32: invokeinterface #210,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      37: ifne          42
      40: iconst_1
      41: ireturn
      42: aload_0
      43: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      46: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
      49: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      52: ifne          57
      55: iconst_1
      56: ireturn
      57: aload_0
      58: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      61: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      64: ifnull        85
      67: aload_0
      68: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      71: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      74: invokevirtual #128                // Method android/net/Uri.toString:()Ljava/lang/String;
      77: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      80: ifne          85
      83: iconst_1
      84: ireturn
      85: iconst_0
      86: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: new           #213                // class android/support/v4/g/b
       3: dup
       4: invokespecial #214                // Method android/support/v4/g/b."<init>":()V
       7: astore_1
       8: aload_0
       9: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      12: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      15: ifnull        35
      18: aload_1
      19: aload_0
      20: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      23: getfield      #70                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      26: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
      29: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
      34: pop
      35: aload_0
      36: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      39: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      42: ifnull        89
      45: aload_0
      46: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      49: getfield      #77                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      52: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      57: astore_2
      58: aload_2
      59: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      64: ifeq          89
      67: aload_1
      68: aload_2
      69: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      74: checkcast     #101                // class java/lang/String
      77: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
      80: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
      85: pop
      86: goto          58
      89: aload_0
      90: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      93: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
      96: ifnull        116
      99: aload_1
     100: aload_0
     101: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     104: getfield      #109                // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     107: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
     110: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
     115: pop
     116: aload_0
     117: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     120: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     123: ifnull        146
     126: aload_1
     127: aload_0
     128: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     131: getfield      #120                // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     134: invokevirtual #167                // Method android/net/Uri.getPath:()Ljava/lang/String;
     137: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
     140: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
     145: pop
     146: aload_0
     147: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     150: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     153: ifnull        219
     156: aload_0
     157: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
     160: getfield      #131                // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     163: invokeinterface #89,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     168: astore_2
     169: aload_2
     170: invokeinterface #95,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     175: ifeq          219
     178: aload_2
     179: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     184: checkcast     #133                // class ryey/easer/plugins/operation/d/f$a
     187: astore_3
     188: aload_1
     189: aload_3
     190: getfield      #136                // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
     193: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
     196: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
     201: pop
     202: aload_1
     203: aload_3
     204: getfield      #140                // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
     207: invokestatic  #217                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
     210: invokeinterface #223,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
     215: pop
     216: goto          169
     219: aload_1
     220: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class ryey/easer/plugins/operation/d/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/operation/d/b
      24: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
      27: invokevirtual #229                // Method ryey/easer/plugins/operation/d/f.equals:(Ljava/lang/Object;)Z
      30: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #32                 // Field a:Lryey/easer/plugins/operation/d/f;
       5: iconst_0
       6: invokevirtual #235                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
       9: return
}
