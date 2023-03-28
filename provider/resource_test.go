package provider

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestLowercaseLettersAndNumbers(t *testing.T) {
	cases := map[string]string{
		"abc123":  "abc123",
		"ABC123":  "abc123",
		"abc-123": "abc123",
		"ABC-123": "abc123",
		"abc_123": "abc123",
		"ABC_123": "abc123",
		"abc.123": "abc123",
	}
	for s, expected := range cases {
		assert.Equal(t, lowercaseLettersAndNumbers(s), expected)
	}
}
