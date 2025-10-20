-- Migration: Add risk assessment fields to vulnerability table
-- Non-breaking for existing rows

ALTER TABLE vulnerability
ADD COLUMN risk_impact VARCHAR(32) NULL,
ADD COLUMN risk_likelihood VARCHAR(32) NULL,
ADD COLUMN risk_justification TEXT NULL,
ADD COLUMN risk_level VARCHAR(32) NULL;
