package com.jive.oss.bgp.net.attributes;

import org.apache.commons.lang3.builder.CompareToBuilder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CommunityMember implements Comparable<CommunityMember>
{

  @Getter
  @Setter
  private int asNumber;

  @Getter
  @Setter

  private int memberFlags;

  public CommunityMember()
  {
  }

  public CommunityMember(final int asNumber, final int memberFlags)
  {
    this.asNumber = asNumber;
    this.memberFlags = memberFlags;
  }

  @Override
  public int compareTo(final CommunityMember o)
  {
    return (new CompareToBuilder())
        .append(this.getAsNumber(), o.getAsNumber())
        .append(this.getMemberFlags(), o.getMemberFlags())
        .toComparison();
  }

}