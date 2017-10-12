/*
 * Copyright (C) 2017 jgqui
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author jgqui
 */
public class Location implements Serializable {
    private int row;
    private int column;
    private int distanceToOregon;                

    public Location(int row, int column, int distanceToOregon) {
        this.row = row;
        this.column = column;
        this.distanceToOregon = distanceToOregon;
    }

    public Location() {
        //???
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getDistanceToOregon() {
        return distanceToOregon;
    }

    public void setDistanceToOregon(int distanceToOregon) {
        this.distanceToOregon = distanceToOregon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.row;
        hash = 61 * hash + this.column;
        hash = 61 * hash + this.distanceToOregon;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.distanceToOregon != other.distanceToOregon) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", distanceToOregon=" + distanceToOregon + '}';
    }
}
