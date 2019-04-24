public class android.support.v4.g.g<K, V> {
  public android.support.v4.g.g(int);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: iload_1
       5: ifgt          18
       8: new           #23                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #25                 // String maxSize <= 0
      14: invokespecial #28                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: iload_1
      20: putfield      #30                 // Field c:I
      23: aload_0
      24: new           #32                 // class java/util/LinkedHashMap
      27: dup
      28: iconst_0
      29: ldc           #33                 // float 0.75f
      31: iconst_1
      32: invokespecial #36                 // Method java/util/LinkedHashMap."<init>":(IFZ)V
      35: putfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      38: return

  public final V a(K);
    Code:
       0: aload_1
       1: ifnonnull     14
       4: new           #68                 // class java/lang/NullPointerException
       7: dup
       8: ldc           #70                 // String key == null
      10: invokespecial #71                 // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: aload_0
      15: monitorenter
      16: aload_0
      17: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      20: aload_1
      21: invokevirtual #74                 // Method java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
      24: astore_2
      25: aload_2
      26: ifnull        43
      29: aload_0
      30: aload_0
      31: getfield      #76                 // Field g:I
      34: iconst_1
      35: iadd
      36: putfield      #76                 // Field g:I
      39: aload_0
      40: monitorexit
      41: aload_2
      42: areturn
      43: aload_0
      44: aload_0
      45: getfield      #78                 // Field h:I
      48: iconst_1
      49: iadd
      50: putfield      #78                 // Field h:I
      53: aload_0
      54: monitorexit
      55: aload_0
      56: aload_1
      57: invokevirtual #80                 // Method b:(Ljava/lang/Object;)Ljava/lang/Object;
      60: astore_2
      61: aload_2
      62: ifnonnull     67
      65: aconst_null
      66: areturn
      67: aload_0
      68: monitorenter
      69: aload_0
      70: aload_0
      71: getfield      #82                 // Field e:I
      74: iconst_1
      75: iadd
      76: putfield      #82                 // Field e:I
      79: aload_0
      80: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      83: aload_1
      84: aload_2
      85: invokevirtual #86                 // Method java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      88: astore_3
      89: aload_3
      90: ifnull        106
      93: aload_0
      94: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      97: aload_1
      98: aload_3
      99: invokevirtual #86                 // Method java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     102: pop
     103: goto          121
     106: aload_0
     107: aload_0
     108: getfield      #88                 // Field b:I
     111: aload_0
     112: aload_1
     113: aload_2
     114: invokespecial #90                 // Method c:(Ljava/lang/Object;Ljava/lang/Object;)I
     117: iadd
     118: putfield      #88                 // Field b:I
     121: aload_0
     122: monitorexit
     123: aload_3
     124: ifnull        137
     127: aload_0
     128: iconst_0
     129: aload_1
     130: aload_2
     131: aload_3
     132: invokevirtual #93                 // Method a:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
     135: aload_3
     136: areturn
     137: aload_0
     138: aload_0
     139: getfield      #30                 // Field c:I
     142: invokevirtual #95                 // Method a:(I)V
     145: aload_2
     146: areturn
     147: astore_1
     148: aload_0
     149: monitorexit
     150: aload_1
     151: athrow
     152: astore_1
     153: aload_0
     154: monitorexit
     155: aload_1
     156: athrow
    Exception table:
       from    to  target type
          16    25   152   any
          29    41   152   any
          43    55   152   any
          69    89   147   any
          93   103   147   any
         106   121   147   any
         121   123   147   any
         148   150   147   any
         153   155   152   any

  public final V a(K, V);
    Code:
       0: aload_1
       1: ifnull        96
       4: aload_2
       5: ifnonnull     11
       8: goto          96
      11: aload_0
      12: monitorenter
      13: aload_0
      14: aload_0
      15: getfield      #98                 // Field d:I
      18: iconst_1
      19: iadd
      20: putfield      #98                 // Field d:I
      23: aload_0
      24: aload_0
      25: getfield      #88                 // Field b:I
      28: aload_0
      29: aload_1
      30: aload_2
      31: invokespecial #90                 // Method c:(Ljava/lang/Object;Ljava/lang/Object;)I
      34: iadd
      35: putfield      #88                 // Field b:I
      38: aload_0
      39: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      42: aload_1
      43: aload_2
      44: invokevirtual #86                 // Method java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      47: astore_3
      48: aload_3
      49: ifnull        67
      52: aload_0
      53: aload_0
      54: getfield      #88                 // Field b:I
      57: aload_0
      58: aload_1
      59: aload_3
      60: invokespecial #90                 // Method c:(Ljava/lang/Object;Ljava/lang/Object;)I
      63: isub
      64: putfield      #88                 // Field b:I
      67: aload_0
      68: monitorexit
      69: aload_3
      70: ifnull        81
      73: aload_0
      74: iconst_0
      75: aload_1
      76: aload_3
      77: aload_2
      78: invokevirtual #93                 // Method a:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
      81: aload_0
      82: aload_0
      83: getfield      #30                 // Field c:I
      86: invokevirtual #95                 // Method a:(I)V
      89: aload_3
      90: areturn
      91: astore_1
      92: aload_0
      93: monitorexit
      94: aload_1
      95: athrow
      96: new           #68                 // class java/lang/NullPointerException
      99: dup
     100: ldc           #100                // String key == null || value == null
     102: invokespecial #71                 // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
     105: athrow
    Exception table:
       from    to  target type
          13    48    91   any
          52    67    91   any
          67    69    91   any
          92    94    91   any

  public void a(int);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #88                 // Field b:I
       6: iflt          135
       9: aload_0
      10: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      13: invokevirtual #105                // Method java/util/LinkedHashMap.isEmpty:()Z
      16: ifeq          29
      19: aload_0
      20: getfield      #88                 // Field b:I
      23: ifeq          29
      26: goto          135
      29: aload_0
      30: getfield      #88                 // Field b:I
      33: iload_1
      34: if_icmple     132
      37: aload_0
      38: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      41: invokevirtual #105                // Method java/util/LinkedHashMap.isEmpty:()Z
      44: ifeq          50
      47: goto          132
      50: aload_0
      51: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      54: invokevirtual #109                // Method java/util/LinkedHashMap.entrySet:()Ljava/util/Set;
      57: invokeinterface #115,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      62: invokeinterface #121,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      67: checkcast     #123                // class java/util/Map$Entry
      70: astore_3
      71: aload_3
      72: invokeinterface #126,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
      77: astore_2
      78: aload_3
      79: invokeinterface #129,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
      84: astore_3
      85: aload_0
      86: getfield      #38                 // Field a:Ljava/util/LinkedHashMap;
      89: aload_2
      90: invokevirtual #132                // Method java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      93: pop
      94: aload_0
      95: aload_0
      96: getfield      #88                 // Field b:I
      99: aload_0
     100: aload_2
     101: aload_3
     102: invokespecial #90                 // Method c:(Ljava/lang/Object;Ljava/lang/Object;)I
     105: isub
     106: putfield      #88                 // Field b:I
     109: aload_0
     110: aload_0
     111: getfield      #134                // Field f:I
     114: iconst_1
     115: iadd
     116: putfield      #134                // Field f:I
     119: aload_0
     120: monitorexit
     121: aload_0
     122: iconst_1
     123: aload_2
     124: aload_3
     125: aconst_null
     126: invokevirtual #93                 // Method a:(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
     129: goto          0
     132: aload_0
     133: monitorexit
     134: return
     135: new           #44                 // class java/lang/StringBuilder
     138: dup
     139: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
     142: astore_2
     143: aload_2
     144: aload_0
     145: invokevirtual #138                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     148: invokevirtual #143                // Method java/lang/Class.getName:()Ljava/lang/String;
     151: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     154: pop
     155: aload_2
     156: ldc           #145                // String .sizeOf() is reporting inconsistent results!
     158: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     161: pop
     162: new           #58                 // class java/lang/IllegalStateException
     165: dup
     166: aload_2
     167: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     170: invokespecial #63                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     173: athrow
     174: astore_2
     175: aload_0
     176: monitorexit
     177: aload_2
     178: athrow
    Exception table:
       from    to  target type
           2    26   174   any
          29    47   174   any
          50   121   174   any
         132   134   174   any
         135   174   174   any
         175   177   174   any

  protected void a(boolean, K, V, V);
    Code:
       0: return

  protected int b(K, V);
    Code:
       0: iconst_1
       1: ireturn

  protected V b(K);
    Code:
       0: aconst_null
       1: areturn

  public final java.lang.String toString();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #76                 // Field g:I
       6: aload_0
       7: getfield      #78                 // Field h:I
      10: iadd
      11: istore_1
      12: iload_1
      13: ifeq          88
      16: aload_0
      17: getfield      #76                 // Field g:I
      20: bipush        100
      22: imul
      23: iload_1
      24: idiv
      25: istore_1
      26: goto          29
      29: getstatic     #152                // Field java/util/Locale.US:Ljava/util/Locale;
      32: ldc           #154                // String LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]
      34: iconst_4
      35: anewarray     #5                  // class java/lang/Object
      38: dup
      39: iconst_0
      40: aload_0
      41: getfield      #30                 // Field c:I
      44: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      47: aastore
      48: dup
      49: iconst_1
      50: aload_0
      51: getfield      #76                 // Field g:I
      54: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      57: aastore
      58: dup
      59: iconst_2
      60: aload_0
      61: getfield      #78                 // Field h:I
      64: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      67: aastore
      68: dup
      69: iconst_3
      70: iload_1
      71: invokestatic  #160                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      74: aastore
      75: invokestatic  #166                // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      78: astore_2
      79: aload_0
      80: monitorexit
      81: aload_2
      82: areturn
      83: astore_2
      84: aload_0
      85: monitorexit
      86: aload_2
      87: athrow
      88: iconst_0
      89: istore_1
      90: goto          29
    Exception table:
       from    to  target type
           2    12    83   any
          16    26    83   any
          29    79    83   any
}
