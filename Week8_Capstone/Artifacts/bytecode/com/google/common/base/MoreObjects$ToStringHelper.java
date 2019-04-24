public final class com.google.common.base.MoreObjects$ToStringHelper {
  com.google.common.base.MoreObjects$ToStringHelper(java.lang.String, com.google.common.base.MoreObjects$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #45                 // Method "<init>":(Ljava/lang/String;)V
       5: return

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, char);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokestatic  #68                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, double);
    Code:
       0: aload_0
       1: aload_1
       2: dload_2
       3: invokestatic  #75                 // Method java/lang/String.valueOf:(D)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, float);
    Code:
       0: aload_0
       1: aload_1
       2: fload_2
       3: invokestatic  #79                 // Method java/lang/String.valueOf:(F)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokestatic  #83                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, long);
    Code:
       0: aload_0
       1: aload_1
       2: lload_2
       3: invokestatic  #87                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       6: areturn

  public com.google.common.base.MoreObjects$ToStringHelper add(java.lang.String, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokestatic  #91                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
       6: invokespecial #70                 // Method addHolder:(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       9: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(char);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #68                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(double);
    Code:
       0: aload_0
       1: dload_1
       2: invokestatic  #75                 // Method java/lang/String.valueOf:(D)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(float);
    Code:
       0: aload_0
       1: fload_1
       2: invokestatic  #79                 // Method java/lang/String.valueOf:(F)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #83                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(long);
    Code:
       0: aload_0
       1: lload_1
       2: invokestatic  #87                 // Method java/lang/String.valueOf:(J)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       5: areturn

  public com.google.common.base.MoreObjects$ToStringHelper addValue(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #91                 // Method java/lang/String.valueOf:(Z)Ljava/lang/String;
       5: invokespecial #95                 // Method addHolder:(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;
       8: areturn

  public com.google.common.base.MoreObjects$ToStringHelper omitNullValues();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #31                 // Field omitNullValues:Z
       5: aload_0
       6: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #31                 // Field omitNullValues:Z
       4: istore_1
       5: ldc           #105                // String
       7: astore_3
       8: new           #107                // class java/lang/StringBuilder
      11: dup
      12: bipush        32
      14: invokespecial #110                // Method java/lang/StringBuilder."<init>":(I)V
      17: astore        5
      19: aload         5
      21: aload_0
      22: getfield      #41                 // Field className:Ljava/lang/String;
      25: invokevirtual #114                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      28: pop
      29: aload         5
      31: bipush        123
      33: invokevirtual #117                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      36: pop
      37: aload_0
      38: getfield      #27                 // Field holderHead:Lcom/google/common/base/MoreObjects$ToStringHelper$ValueHolder;
      41: astore_2
      42: aload_2
      43: getfield      #50                 // Field com/google/common/base/MoreObjects$ToStringHelper$ValueHolder.next:Lcom/google/common/base/MoreObjects$ToStringHelper$ValueHolder;
      46: astore        4
      48: aload         4
      50: ifnull        172
      53: aload         4
      55: getfield      #57                 // Field com/google/common/base/MoreObjects$ToStringHelper$ValueHolder.value:Ljava/lang/Object;
      58: astore        6
      60: iload_1
      61: ifeq          72
      64: aload         4
      66: astore_2
      67: aload         6
      69: ifnull        42
      72: aload         5
      74: aload_3
      75: invokevirtual #114                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: ldc           #119                // String ,
      81: astore_3
      82: aload         4
      84: getfield      #61                 // Field com/google/common/base/MoreObjects$ToStringHelper$ValueHolder.name:Ljava/lang/String;
      87: ifnull        109
      90: aload         5
      92: aload         4
      94: getfield      #61                 // Field com/google/common/base/MoreObjects$ToStringHelper$ValueHolder.name:Ljava/lang/String;
      97: invokevirtual #114                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     100: pop
     101: aload         5
     103: bipush        61
     105: invokevirtual #117                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     108: pop
     109: aload         6
     111: ifnull        158
     114: aload         6
     116: invokevirtual #123                // Method java/lang/Object.getClass:()Ljava/lang/Class;
     119: invokevirtual #129                // Method java/lang/Class.isArray:()Z
     122: ifeq          158
     125: iconst_1
     126: anewarray     #4                  // class java/lang/Object
     129: dup
     130: iconst_0
     131: aload         6
     133: aastore
     134: invokestatic  #135                // Method java/util/Arrays.deepToString:([Ljava/lang/Object;)Ljava/lang/String;
     137: astore_2
     138: aload         5
     140: aload_2
     141: iconst_1
     142: aload_2
     143: invokevirtual #139                // Method java/lang/String.length:()I
     146: iconst_1
     147: isub
     148: invokevirtual #142                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
     151: pop
     152: aload         4
     154: astore_2
     155: goto          42
     158: aload         5
     160: aload         6
     162: invokevirtual #145                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     165: pop
     166: aload         4
     168: astore_2
     169: goto          42
     172: aload         5
     174: bipush        125
     176: invokevirtual #117                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     179: pop
     180: aload         5
     182: invokevirtual #147                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     185: areturn
}
